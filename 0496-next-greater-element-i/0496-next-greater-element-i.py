class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        ans = {}
        n = len(nums2)
        st = []
        for i in range(n-1, -1, -1):
            while st and st[-1] <= nums2[i]:
                st.pop()
            if st:
                ans[nums2[i]] = st[-1]
            st.append(nums2[i])
            
        return [ans.get(num, -1) for num in nums1]