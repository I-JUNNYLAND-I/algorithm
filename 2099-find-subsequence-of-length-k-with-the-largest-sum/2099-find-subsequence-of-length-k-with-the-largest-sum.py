class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        heap = []
        for n in nums:
            heapq.heappush(heap, n)
            if len(heap) > k:
                heapq.heappop(heap)
        cnt = Counter(heap)
        res = []
        for n in nums:
            if cnt[n] > 0:
                cnt[n] -= 1
                res.append(n)
        return res