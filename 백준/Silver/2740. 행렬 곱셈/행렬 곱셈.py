aRow, aCol = map(int, input().split())
matA = []
for i in range(aRow):
    matA.append(list(map(int, input().split())))
    
bRow, bCol = map(int, input().split())
matB = []
for i in range(bRow):
    matB.append(list(map(int, input().split())))
    
def productMatrix(A, B):
    return [[sum(a*b for a, b in zip(A_row,B_col)) for B_col in zip(*B)] for A_row in A]

answer = productMatrix(matA, matB)
for row in answer:
    for col in row:
        print(col, end = " ")
    print()
