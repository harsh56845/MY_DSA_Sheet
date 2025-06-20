// https://leetcode.com/problems/assign-cookies/
// TC -> O(nLogn +mLogm)
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0 , j = 0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}

