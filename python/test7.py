C_Major = [int(x) for x in input().split()]

if C_Major == [1, 2, 3, 4, 5, 6, 7, 8]:
    print("ascending")
elif C_Major == [8, 7, 6, 5, 4, 3, 2, 1]:
    print("descending")
else:
    print("mixed")