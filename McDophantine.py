#Dophantine equation 6a+9b + 20c = n
# n == 50,51, 52, 53, 54,55
def n_50(c,a,b,n):
 for a in range(2,3):
    for b in range (1,2):
      for c in range (1,2):
        for n in range (50,51):
            if 6*a + 9*b + 20 *c == n:
               return(n)         
                    
def n_54(c,a,b,n):
 for a in range(3,4):
    for b in range (4,5):
      for c in range (0,1):
        for n in range (54,55):
            if 6*a + 9*b + 20 *c == n:
               return(n)    

def n_51(a,b,n,c):
    for a in range(1,2):
        for b in range(5,6):
            for c in range(0,1):
                for n in range(51,52):
                    if 6*a + 9*b + 20*c == n:
                        return(n)
    
def n_53(a,b,n,c):
    for a in range(1,2):
        for b in range(3,4):
            for c in range(1,2):
                for n in range(53,54):
                    if 6*a + 9*b + 20*c == n:
                        return(n)    

def n_55(a,b,n,c):
    for a in range(1,2):
        for b in range(1,2):
            for c in range(2,3):
                for n in range(55,56):
                    if 6*a + 9*b + 20*c == n:
                        return(n)    

print(n_50, n_51, n_53, n_54, n_55)                                            
                    