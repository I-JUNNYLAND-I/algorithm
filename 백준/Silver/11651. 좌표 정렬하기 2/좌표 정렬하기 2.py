n = int(input())
arr = []
for i in range(n):
    x, y = map(int, input().split())
    arr.append([x, y])

arr.sort(key = lambda x : (x[1], x[0]))
for x, y in arr:
    print(x, y)