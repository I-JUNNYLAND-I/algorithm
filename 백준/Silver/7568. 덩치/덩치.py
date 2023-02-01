n = int(input())
answer = []
temp = []
for i in range(n):
    w, h = map(int, input().split())
    temp.append([w, h])

for i in range(n):
    count = 0
    for j in range(n):
        if temp[i][0] < temp[j][0] and temp[i][1] < temp[j][1]:
            count += 1
    answer.append(count + 1)

for item in answer:
    print(item, end = " ")