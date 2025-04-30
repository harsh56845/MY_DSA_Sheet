// // Normal Method TC -> O(n⋅logm)
class Solution {
    public boolean isEven(int n){
        int c = 0;
        while(n != 0){
            c++;
            n/=10;
        }
        return c % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(isEven(i)) count++;
        }
        return count;
    }
}

// method after considering Constraints TC -> O(n)
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if( (i>9 && i<100) || (i>999 && i<10000) || (i>99999 && i<1000000) ) count++;
        }
        return count;
    }
}
