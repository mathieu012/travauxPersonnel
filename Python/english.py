import bdd
from bdd import selectRandom

print ("Hey, please choose the options !")
print ("For insert a word : << one >>")
print ("For select a word : << two >>")

choose = input ('option :')

if choose == 'one' :
    print ("Hey, please insert your vocabulary !")
    english = input ('word :')
    traduction = input ('mot :')
    dictionnaire = {'ref': 1, 'English' : english, 'Traduction' : traduction }
    print(dictionnaire)
else:
    print(selectRandom())



