h, w = map(int, input().split())
answer = [[-1] * w for _ in range(h)]
current = []
for _ in range(h):
    # unpacked the input string
    current.append([*input()])

for row in range(h):
    c = - 1
    flag = False
    if 'c' in current[row]:
        for col in range(w):
            if current[row][col] == 'c':
                c = 0
                flag = True
            elif flag:
                c += 1
            answer[row][col] = c

for row in range(h):
    for col in range(w):
        if col != w:
            print(answer[row][col], end = " ")
        else:
            print(answer[row][col])
    print()