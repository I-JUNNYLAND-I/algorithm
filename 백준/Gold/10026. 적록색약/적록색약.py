import copy
import sys

sys.setrecursionlimit(10 ** 6)


def dfs(grid, r, c, target, target2):
    if 0 <= r < len(grid) and 0 <= c < len(grid[0]) and (grid[r][c] == target or grid[r][c] == target2):
        grid[r][c] = '-'
        dfs(grid, r + 1, c, target, target2)
        dfs(grid, r - 1, c, target, target2)
        dfs(grid, r, c + 1, target, target2)
        dfs(grid, r, c - 1, target, target2)


n = int(input())
paint = []
for row in range(n):
    paint.append([*input()])

paint_ = copy.deepcopy(paint)
count = 0
R = 0
G = 0
B = 0
for row in range(n):
    for col in range(n):
        if paint[row][col] == 'R':
            dfs(paint, row, col, "R", "R")
            R += 1
        if paint[row][col] == 'G':
            dfs(paint, row, col, "G", "G")
            G += 1
        if paint[row][col] == 'B':
            dfs(paint, row, col, "B", "B")
            B += 1
RG = 0
for row in range(n):
    for col in range(n):
        if paint_[row][col] == 'R' or paint_[row][col] == "G":
            dfs(paint_, row, col, "R", "G")
            RG += 1

print(R + G + B, RG + B)
