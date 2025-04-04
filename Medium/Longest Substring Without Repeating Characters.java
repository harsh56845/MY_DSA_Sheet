// Problem Link :- https://leetcode.com/problems/longest-substring-without-repeating-characters/
// TC -> O(N) SC -> O(1) because size does not depend on N
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] frq = new int[127];
        int i=0,j=0,n=s.length();
        int max = 0;
        while(i<n){
            if(frq[s.charAt(i)] == 1){
                while(frq[s.charAt(i)]!=0){
                    frq[s.charAt(j)]--;
                    j++;
                }
            }
            else{
                frq[s.charAt(i)]++;
                i++;
            }
            max = Math.max(max,i-j);
        }
        return max;
    }
}
