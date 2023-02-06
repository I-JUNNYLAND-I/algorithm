def find_max_value(nums: list):
    max_ = 0
    l = len(nums)
    for i in range(l - 2):
        for j in range(i + 1, l - 1):
            for k in range(j + 1, l):
                temp = nums[i] + nums[j] + nums[k]
                if temp % 10 == 9:
                    return temp % 10
                max_ = max(max_, temp % 10)
    return max_


n = int(input())
people = []
for i in range(n):
    people.append(list(map(int, input().split())))

t = map(lambda x: find_max_value(x), people)
index = [x for x in range(1, n + 1)]
z = list(zip(index, t))
z.sort(key = lambda x: x[1])

answer = z[0]
for i in range(n):
    if z[i][1] >= answer[1]:
        answer = z[i]

print(answer[0])