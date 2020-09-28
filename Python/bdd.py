import mysql.connector
import random
from mysql.connector import errorcode

conn = mysql.connector.connect(host="127.0.0.1", user='root',
                            database='english')
cursor = conn.cursor()

#Sélectionne un mot et sa traduction de manière aléatoire
def selectRandom(): 
    cursor.execute("""SELECT id FROM vocabulaire""")
    idx = cursor.fetchall()
    N = str(random.randint(1,(len(idx)+1)))
    cursor.execute("""SELECT word, mot FROM vocabulaire where id =""" + N)
    data = cursor.fetchall()
    conn.close()
    return data

def insertVocabulaire(english, traduction):
    try:
        requete = ("INSERT INTO vocabulaire (word, mot) VALUES('" + english + "', '"+ traduction + "')" )
        cursor.execute(requete)
        return "SUCCESS"

    except :
        return "ERROR"
    
    
