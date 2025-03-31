// Problem Link :- https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1?page=1
// Eclude theorm
// TC -> O(N)
class Solution {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int hcf = gcd(a,b);
        int lcm = (a*b)/hcf;
        return new int[]{lcm,hcf};
        
        
    }
}
