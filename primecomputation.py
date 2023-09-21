from itertools import count
from unicodedata import name
def prime():
 num1 = 2
 l = [2,3]
 while num1 <=10000:
    if num1%2 !=0: # checking for odd number
        for i in range (3,num1) : # checking if n is a candidate to be prime 
            if num1%i !=0 :
                l.append(num1)
                num1 += 2
            else:
                num1 += 2    
    else:
        num1 +=1 



def prime_0():       
  a = []
  for num in range (1, 10000):
    if num >1 :
      for i in range (2, num):
          if num % i == 0:
              break
          else :
           a.append(num)
      
def  prime_1():
    for num in range(1,10000):
        if num>1 :
            for i in range(1,num+1):
                if num % i != 0:
                    prime.append()
                else:
                    break            
    return(prime[0])        

def prime_1 (a):
    num = 13
    if num > 1:
        for i in range(2, num//2):
            if (num % i) == 0:
               break
            else:
             a.append 
    return(a[999])         
             
print(prime_1)             

