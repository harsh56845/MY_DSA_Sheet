// Problem Link :- https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// TC -> O(N)
class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 1;
        int prev = nums[0];
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=prev){
                nums[j++] = nums[i];
                prev = nums[i];
                ans++;
            }
        }
        return ans;
    }
}
