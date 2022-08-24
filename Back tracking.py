queens = 4
chess = [[0 for i in range(queens)] for j in range(queens)]
def Issafe(i,j):
    for k in range(queens):
        if chess[i][k]==1 or chess[k][j]==1:
            return True
    for k in range(queens):
        for l in range(queens):
            if k+l==i+j or k-l==i-j:
                if chess[k][l]==1:
                    return True
    return False
def Queen_Placement(n):
    if n==0:
        return True
    for i in range(0,queens):
        for j in range(0,queens):
            if chess[i][j]!=1 and not(Issafe(i,j)):
                chess[i][j]=1
                if Queen_Placement(n-1)==True:
                    return True
                chess[i][j]=0
    return False


Queen_Placement(queens)
print(*chess,sep="\n")
