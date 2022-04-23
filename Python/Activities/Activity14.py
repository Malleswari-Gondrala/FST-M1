def fib(a):
    if (a==0):
         return 0
    elif a==1:
        return 1
    else:
        return (fib(a-1) + fib(a-2))


number =int(input("Enter the No. of fibonacci series"))
count =0
print(f"The fibonacci series is ")
while(count<number):
   ans=fib(count)
   count=count+1
   print(f"{ans}  ")


    