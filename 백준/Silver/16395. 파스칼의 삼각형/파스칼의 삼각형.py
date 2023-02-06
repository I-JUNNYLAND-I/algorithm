n, k = map(int, input().split())
n = n - 1
k = k - 1

ref = {}
ref[0] = 1
ref[1] = 1
ref[2] = 2


def factorial(n, ref):
    if n in ref:
        return ref[n]
    else:
        ref[n] = n * factorial(n - 1, ref)
    return ref[n]


print(factorial(n, ref) // (factorial(k, ref) * factorial(n - k, ref)))