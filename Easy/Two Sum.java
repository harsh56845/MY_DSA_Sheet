// Problem Link :- https://leetcode.com/problems/two-sum/

// TC -> O(NlogN) SC -> O(1)
class Pair{
    int val;
    int idx;
    Pair(int val,int idx){
        this.val = val;
        this.idx = idx;
    }
}
class PairSort implements Comparator<Pair>{
    @Override
    public int compare(Pair p1,Pair p2){
        return p1.val-p2.val;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Pair[] pair = new Pair[n];
        for(int i=0;i<n;i++){
            pair[i] = (new Pair(nums[i],i));
        }
        Arrays.sort(pair,new PairSort());
        int i = 0,j=n-1;
        while(i<j){
            int sum = pair[i].val+pair[j].val;
            if(sum==target) return new int[]{pair[i].idx,pair[j].idx};
            else if(sum>target) j--;
            else i++;
        }
        return new int[]{-1,-1};
    }
}

// TC -> O(N) SC -> O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int find = target-nums[i];
            if(map.containsKey(find)){
                return new int[] {map.get(find),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
