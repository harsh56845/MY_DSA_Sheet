// problem Link :- https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
// TC -> O(N)
// 1 TestCase issue code is perfect
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> sol = new ArrayList<>();
        int n = arr.length;
        long expSum = (long)(n*0.5*n + 0.5*n), expSqSum = (long)((n*n+n)*0.5*(2*n+1)/3);
        long aSN =0, AsSqN = 0;
        for(int i:arr){
            expSum-=i;
            expSqSum-=i*i;
        }
        long xMINUSy = expSum;
        long xPlusY = (expSqSum)/xMINUSy;
        
        int missNum = (int)(xPlusY + xMINUSy)/2;
        int repNum = (int)(xPlusY-missNum);
        
        sol.add(repNum);
        sol.add(missNum);
        
        return sol;
    }
}
