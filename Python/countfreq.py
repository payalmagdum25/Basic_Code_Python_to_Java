num=int(input("enter num :"))

digit=int(input("enter digit to count:"))
count=0

while num>0:
    if(num % 10 == digit ):
        count += 1
    num //= 10

print("Frequency:",count)
