// Problem Link :- https://leetcode.com/problems/rotate-array/
// TC -> O(N) SC -> O(1)
class Solution {
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            nums[i] = nums[i]+nums[j]-(nums[j]=nums[i]);
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}
