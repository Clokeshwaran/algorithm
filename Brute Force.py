from itertools import combinations_with_replacement as rep
n=int(input("Enter the amount :"))
coins = [1,2,5]
arr=[]
for i in range(1,n+1):
    arr.append(rep(coins,i))
temp=[]
for j in arr:
    for k in j:
        if sum(k)==n:
            temp.append(k)
print(temp[0])