S = input()
alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']


for x in range (0, len(alphabet)):
    if alphabet[x] in S:
        print(S.index(alphabet[x]), end = ' ')
    else:
        print(-1, end = ' ')