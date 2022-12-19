class Solution:
    def countBalls(self, lowLimit: int, highLimit: int) -> int:
        ball_map = collections.defaultdict(int)
        for num in range(lowLimit, highLimit+1):
            num = sum([int(x) for x in str(num)])
            ball_map[num] += 1
        return max(ball_map.values())