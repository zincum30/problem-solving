N = int(input())
score = [int(x) for x in input().split()]

for i in range(0,len(score)):
    x = score[i]

sum = 0
for i in range (0, N):
    sum = sum + score[i] / max(score) *100
 
print(sum/N)

['40', '80', '60']
[40,80,60]
[ 40 / 80 * 100, 80 / 80 * 100, 60 / 80 * 100]
