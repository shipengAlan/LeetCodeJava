//https://leetcode.com/problems/combination-sum-ii/description/
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int sum = 0, index = 0;
        ArrayList<Integer> cur = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        combination(candidates, target, sum, index, cur, res);
        return res;
    }
    public void combination(int[] candidates, int target, int sum, int index, ArrayList<Integer> cur, List<List<Integer>> res){
        if(sum>target) return;
        if(sum==target){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int t: cur) tmp.add(t);
            res.add(tmp);
        }
        else{
            int i=index;
            while(i<candidates.length){
                if(candidates[i]+sum<=target){
                    cur.add(candidates[i]);
                    combination(candidates, target, sum+candidates[i], i+1, cur, res);
                    cur.remove(cur.size()-1);
                    i++;
                    while(i<candidates.length&&candidates[i]==candidates[i-1]){
                        i++;
                    }
                }
                else{
                    break;
                }
            }
        }
    }
}