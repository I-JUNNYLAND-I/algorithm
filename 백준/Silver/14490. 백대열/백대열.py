def get_gcd(a:int, b:int) -> int:
    if b == 0:
        return a
    else:
        return get_gcd(b, a % b)

n, m = map(int, input().split(":"))
gcd = get_gcd(n, m)
print(f"{n // gcd}:{m // gcd}")