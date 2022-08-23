a=[1,2,5]
amount=int(input("Enter the amount:"))
arr=[]

def rec(a,amount,arr):
    if amount==0:
        return arr
    count=(amount//max(a))
    for i in range(count):
        arr.append(max(a))
    amount-=count*max(a)
    a.remove(max(a))
    return rec(a,amount,arr)


rec(a,amount,arr)
print(arr)
