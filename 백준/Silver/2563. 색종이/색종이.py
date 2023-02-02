n = int(input())
grid = [[0] * 100 for _ in range(100)]
for _ in range(n):
    y, x = map(int, input().split())
    for row in range(x, x + 10):
        for col in range(y, y + 10):
            grid[row][col] = 1
result = 0
for k in range(100):
    result += grid[k].count(1)
print(result)