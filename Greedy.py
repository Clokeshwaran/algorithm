def lokesh(am):
    c = [1, 2, 5]
    n = len(c)
    # ans = []
    i = n - 1
    while i >= 0:
        while am >= c[i]:
            am = am- c[i]
            print(c[i])
        i=i-1

print('Enter the Amount : ')
n = int(input())
lokesh(n)



