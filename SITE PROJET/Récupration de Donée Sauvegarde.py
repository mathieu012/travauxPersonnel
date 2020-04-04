import time
import json
import requests



        
login = "censored"                   # variable login de sigfox
password = "censored"        # variable password de sigfox
authentication = (login, password)                   # variable assemble login & password 


r = requests.get ("censored" # requette
                  ,auth=authentication)

packages_json = r.json()

package_str = json.dumps(packages_json, indent = 2)

fichier = open("Test.txt", "w")                      # ouverture du fichier Test
fichier.write(package_str)                           # ecrire le contenu de la variable package_str
fichier.close                                        # fermer le fichier Test


        
        

        
        
