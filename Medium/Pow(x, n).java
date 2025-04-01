// Problem Link :- https://leetcode.com/problems/powx-n/
// TC -> O(logN) 
// Concept :- Recursion divide and conqure
class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        // +ve case
        if(n>0){
            if(n%2 != 0){
                return x*myPow(x,n-1);
            }
            else{
                return myPow(x*x,n/2);
            }
        }
        // -ve case
        else{
            if(n%2 != 0){
                return (1/x)*myPow(x,n+1);
            }
            else{
                return myPow(x*x,n/2);
            }

        }
    }
}
