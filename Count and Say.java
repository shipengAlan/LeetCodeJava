//https://leetcode.com/problems/count-and-say/description/
class Solution {
    public String countAndSay(int n) {
        String str = "1";
        if(n==1)
            return str;
        for(int i=2;i<=n;i++){
            String res = "";
            int num = 1;
            int cur = str.charAt(0) - '0';
            for(int j=1;j<str.length();j++){
                if(str.charAt(j)-'0'==cur){
                    num++;
                }
                else{
                    res+= "" + num + cur;
                    cur = str.charAt(j)-'0';
                    num = 1;
                }
            }
            res += "" + num + cur;
            str = res;
        }
        return str;
    }
}