// Problem link :- https://leetcode.com/problems/first-unique-character-in-a-string/
// TC -> O(N) and SC -> (1)
class Solution {
    public int firstUniqChar(String s) {
        int[] frq = new int[26];
        for(char ch:s.toCharArray()){
            frq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(frq[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
