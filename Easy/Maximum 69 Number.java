// problem Link :- https://leetcode.com/problems/maximum-69-number/
// TC -> O(digits) eqvivalent to O(1)
class Solution {
    public int maximum69Number (int num) {
        int n = num;
        int place = 0 , count = 0;
        while(n!=0){
            count++;
            if(n%10==6) place=count;
            n/=10;
        }
        if(place==0) return num;
        
        while(num!=0){
            place--;
            if(place==0) n=n*10+9;
            else n=n*10+num%10;
            num/=10;
        }
        while(n!=0){
            num=num*10+n%10;
            n/=10;
        }
        return num;
    }
}
