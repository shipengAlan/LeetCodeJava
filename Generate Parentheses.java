//https://leetcode.com/problems/generate-parentheses/description/
class Solution {
    public List<String> generateParenthesis(int n) {
        int left = n;
        int right = n;
        ArrayList<String> res = new ArrayList<String>();
        String cur = "";
        getNext(left, right, cur, res);
        return res;
    }
    public void getNext(int left, int right, String cur, ArrayList<String> res){
        if(left==0&&right==0){
            res.add(cur);
            return;
        }
        if(left<=right){
            if(left>0){
                String tmp = cur + "(";
                getNext(left-1, right, tmp, res);
            }
            if(right>0){
                String tmp = cur + ")";
                getNext(left, right-1, tmp, res);
            }
        }
    }
}