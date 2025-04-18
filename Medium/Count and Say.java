// Problem Link :- https://leetcode.com/problems/count-and-say/?envType=daily-question&envId=2025-04-18
// TC -> O(2^n) and SC also same 
class Solution {
    public String countAndSay(int n) {
        StringBuilder str = new StringBuilder();
        str.append(1);

        while(n!=1){
            StringBuilder temp = new StringBuilder();
            int i = 0;
            while(i<str.length()){
                char ch = str.charAt(i);
                int count = 0;
                // int j = i;
                while(i<str.length() && ch==str.charAt(i)){
                    count++;
                    i++;
                }
                // if(i<str.length() && ch!=str.charAt(i)) i--;
                // temp += String.valueOf(count)+ch;
                temp.append(count).append(ch);
            }
            str = temp;
            n--;
        }
        return str.toString();
    }
}
