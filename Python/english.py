import bdd
from bdd import selectRandom
from bdd import insertVocabulaire
from bdd import close 

print ("Hey, please choose the options !")
print ("For insert a word : << one >>")
print ("For select a word : << touche entrée >>")
print ("For stop the programe : << stop >>")


while "1" == "1":
    choose = input ('option :')
    if choose == 'one' :
        print ("Hey, please insert your vocabulary !")
        english = input ('word :')
        traduction = input ('mot :')
        print(insertVocabulaire(english, traduction))
    elif choose == 'stop':     
        close()
        break
    else:
        #Bug : ne ma rien sortie une fois
        print(selectRandom())
        




