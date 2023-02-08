import copy
import sys
sys.setrecursionlimit(10**6)

def DFS(grid, row, col, target, target2):
    if row >= 0 and col >= 0 and row < len(grid) and col < len(grid[0]) and (grid[row][col] == target or grid[row][col] == target2):
        grid[row][col] = '-'
        DFS(grid, row + 1, col, target, target2)
        DFS(grid, row - 1, col, target, target2)
        DFS(grid, row, col + 1, target, target2)
        DFS(grid, row, col - 1, target, target2)

n = int(input())
grid = []
for row in range(n):
    grid.append([*input()])

grid_ = copy.deepcopy(grid)
count = 0
R = 0
G = 0
B = 0
for row in range(n):
    for col in range(n):
        if grid[row][col] == 'R':
            DFS(grid, row, col, "R", "R")
            R += 1
        if grid[row][col] == 'G':
            DFS(grid, row, col, "G", "G")
            G += 1
        if grid[row][col] == 'B':
            DFS(grid, row, col, "B", "B")
            B += 1
RG = 0
for row in range(n):
    for col in range(n):
        if grid_[row][col] == 'R' or grid_[row][col] == "G":
            DFS(grid_, row, col, "R", "G")
            RG += 1

print(R + G + B, RG + B)
