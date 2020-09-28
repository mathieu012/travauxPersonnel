print ("Programme de comptabilité")
print ("Entré les dépenses du mois de septembre")
depense = [0]

entre = input ('Dépense :')

while entre != "stop" : 
    depense.append(int(entre))
    entre = input ('Dépense :')
    
print ('hello')
print (sum(depense))

