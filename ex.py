
a=['a','b','c','d','e','f','g','h','i','j','k']
i=0
count=1
print(a)
while(len(a)!=1):
    if count%4==0:
        a.remove(a[i])
    if count%10==4:
        a.remove(a[i])
    if ((len(a)-1)==i):
        i=0;
    else:
        i+=1

    count+=1



print(a)