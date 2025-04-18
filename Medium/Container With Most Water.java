// Prob Link :- https://leetcode.com/problems/container-with-most-water/description/
// TC -> O(N)
class Solution {
    public int maxArea(int[] height) {
        int i = 0 , j =height.length-1;
        int max = 0;
        while(i<j){
            int len = Math.min(height[i],height[j]);
            int bre = j-i;
            int area = len*bre;
            max = Math.max(area,max);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return max;
    }
}
