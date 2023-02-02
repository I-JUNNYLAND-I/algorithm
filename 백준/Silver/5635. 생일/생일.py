import sys
n = int(sys.stdin.readline().rstrip())
arr = []
for _ in range(n):
    name, day, month, year = sys.stdin.readline().rstrip().split()
    arr.append([int(year), int(month), int(day), name])
arr.sort(reverse=True, key = lambda x: (x[0], x[1], x[2]))
print(arr[0][3])
print(arr[n - 1][3])