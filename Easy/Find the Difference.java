// Problem Link :- https://leetcode.com/problems/find-the-difference/
// TC -> O(N) , SC -> O(1)
// Approch using Assic values
class Solution {
    public char findTheDifference(String s, String t) {
        int AsicS = 0;
        int AsicT = 0;
        for(char ch:s.toCharArray()){
            AsicS += (int)ch;
        }
        for(char ch:t.toCharArray()){
            AsicT += (int)ch;
        }
        return (char)(AsicT - AsicS);
    }
}
