import requests
import sqlite3

# Modificar valores para ajustar búsqueda
db_path = 'directorio'
base_url = "http://www.omdbapi.com/"
api_key = 'apikey'
title = "Star Wars"

def db_connect(db_path):
    conn = sqlite3.connect(db_path)
    cursor = conn.cursor()
    return conn, cursor

def execute_db_query(connection, cursor, data):

    # Crear la query
    cursor.execute('''
        INSERT INTO peliculas (imdbID, title, year, plot)
        VALUES (?, ?, ?, ?)
    ''', data)

    # Ejecutar
    try:
        connection.commit()
        return True
    except sqlite3.Error as e:
        connection.rollback()
    return False

def get_movies_by_title(base_url, api_key, title):

    # Búsqueda
    params = {
        's': title,
        'apikey': api_key,
        'type': 'movie'
    }
    response = requests.get(base_url, params=params)
    
    # Comprobación
    if response.status_code == 200:
        data = response.json()
        if data['Response'] == 'True':
            return data['Search']
        else:
            print(f"Not found")
            return None
    else:
        print(f"Error: {response.status_code}")
        return None

def get_movie_details(base_url,api_key, imdb_id):
    
    # Búsqueda
    params = {
        'i': imdb_id,
        'apikey': api_key
    }
    response = requests.get(base_url, params=params)
    
    # Comprobación
    if response.status_code == 200:
        return response.json()
    else:
        print(f"Error: {response.status_code}")
        return None

movies = get_movies_by_title(base_url, api_key, title)

if movies:

    conn, cursor = db_connect(db_path)
    for movie in movies:
        movie_details = get_movie_details(base_url, api_key, movie['imdbID'])
        
        if movie_details:
            row = [movie_details['imdbID'], movie_details['Title'], movie_details['Year'], movie_details['Plot'],]
            if execute_db_query(conn, cursor, row):
                print("Fila insertada correctamente")
            else:
                print("Error insertando fila: ", row)


