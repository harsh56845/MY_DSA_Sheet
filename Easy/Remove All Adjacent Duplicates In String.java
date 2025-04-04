// Problem Link :- https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// TC -> O(N) SC -> O(N) with extra char array
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        char[] chars = s.toCharArray();
        int i=0,j=0;
        while(j<s.length()){
            if(i>0 && chars[i-1]==s.charAt(j)){
                i--;
                j++;
            }
            else{
                chars[i++] = s.charAt(j++);
            }
        }
        for(int k=0;k<i;k++){
            ans.append(chars[k]);
        }
        return ans.toString();
        // return ans.reverse().toString();
    }
}



// TC -> O(N) SC -> O(N) With Stack
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty() || st.peek()!=ch){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        while(!st.isEmpty()) ans.append(st.pop());
        return ans.reverse().toString();
    }
}
