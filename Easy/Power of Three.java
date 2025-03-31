// Problem Link -> https://leetcode.com/problems/power-of-three/solutions/6053168/0-ms-runtime-beats-100-user-confirm-step-by-steps-solution-beginner-friendly/

// TC -> O(LogN)  
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n!=1){
            if(n%3!=0) return false;
            n=n/3;
        }
       
        return true;
    }
}


Approach 2: Mathematical Property
The largest power of 3 within the 32-bit integer range is ( 3^{19} = 1162261467 ).
If ( n ) is a power of three, it must divide ( 1162261467 ) without leaving a remainder.
// TC -> O(1)
class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
