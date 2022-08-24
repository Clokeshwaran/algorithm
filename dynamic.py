def lok(n):
    a=[1,2,5]
    c=[]
    while(n>0):
        if(max(a)<=n):
            c.append(max(a))
            n-=max(a)
        if(max(a)>n):
            a.remove((max(a)))

    return c
n = int(input("Enter the amount:"))
print(lok(n))


