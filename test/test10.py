N, X = map(int, input().split())
integer = [int(x) for x in input().split()]

for i in range (0, len(integer)):
    if integer[i] < X:
        print(integer[i], end=' ')
    else: 
        pass