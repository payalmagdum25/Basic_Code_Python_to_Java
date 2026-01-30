# num=int(input("enter a num :"))

# if(num<=1):
#      print("not prime number")
# else:
#     for i in range(2,int(num**0.5)+1):
#       if(num % i == 0):
#          print("not prime")
#          break
#     else:
#         print("Prime num")
    
num=int(input("enter your num :"))
flag=0
for i in range(2,num//2 + 1):
    if(num % i==0):
       flag=1
       break

if(flag==0 and num>1):
      print("it is prime")
else:
      print("not prinme")