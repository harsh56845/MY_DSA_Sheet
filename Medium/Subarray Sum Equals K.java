// Pronlem Link :- https://github.com/harsh56845/MY_DSA_Sheet/blob/main/Easy/Ugly%20Number.java
// TC -> O(N) , SC -> O(N)
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0 ,ps = 0;
        map.put(0,1);
        for(int i:nums){
            ps+=i;
            // if(i==k) count++;
            // else{
                if(map.containsKey(ps-k)){
                    count += map.get(ps-k);
                }
            // }
            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        return count;
    }
}
