class Solution {
    public boolean check(int[] nums) {
        int maxRot = 1;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                if(maxRot==1) maxRot--;
                else return false;
            }
        }
        if(nums[0]<nums[n-1]){
                if(maxRot!=1) return false;
            }
        return true;
    }
}
