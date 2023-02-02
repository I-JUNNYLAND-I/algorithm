import math

n = int(input())
sqrt_five = 5 ** 0.5
a = (math.pow((1 + sqrt_five) / 2, n - 1) - math.pow((1 - sqrt_five) / 2, n - 1))//sqrt_five
b = (math.pow((1 + sqrt_five) / 2, n) - math.pow((1 - sqrt_five) / 2, n))//sqrt_five
print(int(a), int(b))