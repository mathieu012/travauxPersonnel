import time
import json
import requests

x = time.time()                                              # Variable de temps augmentant de 1 toute les Sec
i = 0


while i < 2 :                                                # Boucle while s'executant à l'infinie 
    
    if time.time()-(x + 10) > 0:                             # Si le programme a attendu 2500 sec alors ...
        
        login = "censored"                                   # variable login de sigfox
        password = "censored"                                # variable password de sigfox
        authentication = (login, password)                   # variable assemble login & password 


        r = requests.get ("censored" # requette
                  ,auth=authentication)

        packages_json = r.json()

        package_str = json.dumps(packages_json, indent = 2)

        fichier = open("Test.txt", "w")                      # ouverture du fichier Test
        fichier.write(package_str)                           # ecrire le contenu de la variable package_str
        fichier.close                                        # fermer le fichier Test

        x = time.time()                                      # Prendre une nouvelle valeure time
        
        

        
        
