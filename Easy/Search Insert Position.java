// Problem Link :- https://leetcode.com/problems/search-insert-position/
// TC -> O(LogN)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        int s = 0 , e = nums.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]>=target){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}
