// Problem Link :- https://leetcode.com/problems/product-of-array-except-self/
// TC -> O(N) SC -> O(1) [only req ans space is implemented so addtional is zero]
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            ans[i]=nums[i+1]*ans[i+1];
        }
        int prefix = 1;
        for(int i=0;i<n;i++){
            ans[i] = prefix*ans[i];
            prefix *= nums[i];
        }
        return ans;
    }
}
