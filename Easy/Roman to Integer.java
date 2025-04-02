// Problem Link :- https://leetcode.com/problems/roman-to-integer/
// TC -> O(N) and Sc -> O(1)
class Solution {
    public int romanToNumber(char ch){
        switch(ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return -1;
        }
    }
    public int romanToInt(String s) {
        int ans = 0; 
        int prev = 0; 
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i); 
            int currValue = romanToNumber(ch); 
            if(prev<currValue){ 
                ans = ans + currValue - 2*prev;
            }
            else{
                ans += currValue;
            }
            prev = currValue;
        }
        return ans;
    }
}
