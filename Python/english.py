import bdd
from bdd import selectRandom
from bdd import insertVocabulaire

print ("Hey, please choose the options !")
print ("For insert a word : << one >>")
print ("For select a word : << two >>")

choose = input ('option :')


if choose == 'one' :
    print ("Hey, please insert your vocabulary !")
    english = input ('word :')
    traduction = input ('mot :')
    print(insertVocabulaire(english, traduction))
    
    
else:
    #Bug : ne ma rien sortie une fois
    print(selectRandom())




