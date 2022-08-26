from itertools import combinations_with_replacement as r
a=[1,2,5]
n=[]

am=int(input ("Enter the amount :"))
for i in range(am+1):
    n.append(am)

n[0]=0
for x in range(1,am+1):
    mi=n[x]
    for y in range(len(a)):
        coin=1
        temp=x-a[y]
        if temp>0:
            coin+=n[temp]
        if coin<mi and temp>=0:
            mi=coin

    n[x]=mi



print(n)
print(n[am])