// problem link :- 
// TC -> O(n log log n) and Sc -> On)
class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] seive = new boolean[n];
        for(int i=2;i<n;i++){
            if(seive[i]==false){
                count++;
                for(int j=i;j<n;j=j+i) seive[j] = true;
            }
        }
        return count;
    }
}
