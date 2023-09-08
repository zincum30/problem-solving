word = input()
N = len(word)

if N%10 == 0:
    for x in range (0, N//10):
        print(word[10*x:10*(x+1)])
else:
    for x in range (0, (N//10)+1):
        print(word[10*x:10*(x+1)])
