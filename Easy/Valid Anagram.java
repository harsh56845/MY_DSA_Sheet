// Problem Link :- https://leetcode.com/problems/valid-anagram/
// TC -> O(N) SC -> O(1) because hashArray takes a fixed size of 26 
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] hashArray = new int[26];
        for(char ch:s.toCharArray()){
            hashArray[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            hashArray[ch-'a']--;
        }
        for(int i:hashArray)
        if(i!=0) return false;
        return true;
    }
}
