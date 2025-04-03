// Problem Link :- https://leetcode.com/problems/majority-element/
// Tc -> O(n)
class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0, count = 0;
        for(int i:nums){
            if(count==0){
                ele = i;
            }
            if(ele==i){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
        
    }
}
