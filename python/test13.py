a, b, c = map(int, input().split())


i=1
if a/(c-b) < 0:
    print("-1")
else:
    while a + (b * i) >= c * i:
        i = i + 1
print(i)


