def gcd(a:int, b:int) -> int:
    if b == 0:
        return a
    else:
        return gcd(b, a % b)
    
n, m = map(int, input().split())
print(n * m // gcd(n ,m))