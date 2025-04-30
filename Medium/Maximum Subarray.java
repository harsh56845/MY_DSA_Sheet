// Ques Link -> https://leetcode.com/problems/maximum-subarray/submissions/1621912639/
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0],sum = 0;
        for(int i:nums){
            sum+=i;
            maxSum = Math.max(maxSum,sum);
            sum = Math.max(0,sum);
        }
        return maxSum;
    }
}
