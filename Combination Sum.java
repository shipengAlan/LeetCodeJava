//https://leetcode.com/problems/combination-sum/description/
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int sum = 0;
        ArrayList<Integer> cur = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        combination(candidates, target, sum, 0, cur, res);
        return res;
    }
    public void combination(int [] candidates, int target, int sum, int index,ArrayList<Integer> cur, List<List<Integer>> res){
        if(sum>target){
            return;
        }
        if(sum==target){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int t: cur){
                tmp.add(t);
            }
            res.add(tmp);
        }
        else{
            for(int i=index;i<candidates.length;i++){
                //if(cur.isEmpty()||candidates[i]>=cur.get(cur.size()-1)){
                    if(candidates[i]+sum<=target){
                        cur.add(candidates[i]);
                        combination(candidates, target, sum+candidates[i], i, cur, res);
                        cur.remove(cur.size()-1);
                    }
                    else
                        break;
                //}
            }
        }
    }
}