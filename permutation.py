import random
v=['a','e','i','o','u']
def addword():
    f=""
    while(1):
        n=random.choice(v)
        if (n not in f):
            f=f+n
        elif(len(f)==len(v)):
            break
    return f
            
def recur_factorial(n):
   if n == 1:  
       return n  
   else:  
       return n*recur_factorial(n-1)

final=[]
rf=recur_factorial(len(v))
while(1):
    word=addword()
    if(word not in final):
        final.append(word)
        if(len(final)== rf):
            break;
final.sort()
print(final)
