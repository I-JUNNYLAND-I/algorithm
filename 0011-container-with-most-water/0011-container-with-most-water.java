import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        return twoPointerSolution(height);
    }
    
    // 높이가 낮은쪽이 움직이기, two-pointer
    public int twoPointerSolution(int[] height) {
        int pR = height.length - 1;
        int pL = 0;
        int max = 0;
        while (pL < pR) {
            int hR = height[pR];
            int hL = height[pL];
            int volume = (pR - pL) * Math.min(hR, hL);
            max = Math.max(max, volume);
            if (hR > hL) {
                pL++;
            } else {
                pR--;
            }
        }
        return max;
    }
    
    // 모든 경우의 수 확인
    public int bruteForceSolution(int[] height) {
        // Time Limit Exceeded (55/61)
        int len = height.length;
        int max = 0;
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                int volume = (j - i) * Math.min(height[i], height[j]);
                max = Math.max(max, volume);
            }
        }
        return max;
    }
}