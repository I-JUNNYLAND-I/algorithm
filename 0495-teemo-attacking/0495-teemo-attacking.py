class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        if not timeSeries:
            return 0
        
        total = 0
        start = timeSeries[0]
        end = start + duration
        
        for i in range(1, len(timeSeries)):
            time = timeSeries[i]
            if time > end:
                total += end-start  # add to total and reset start
                start = time
            end = time + duration
        
        total += end - start  # must account for final time in timeSeries
        return total