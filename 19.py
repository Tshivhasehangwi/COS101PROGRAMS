
def cube(num):
  return  num*num*num 

result = cube(3)
print(result)

is_male = True
is_tall = False

if is_male and is_tall:
    print("you are a tall male")
elif is_male and not(is_tall) :
    print("you are a short male")
elif not (is_male) and is_tall:
    print("you are short non male")
else:
    print("You are neither tall or male")    
