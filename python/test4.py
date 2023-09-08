A, B = map(int, input().split())    

while A > 0:
    print(A+B)
    A, B = map(int, input().split())
    if A + B == 0:
        break
