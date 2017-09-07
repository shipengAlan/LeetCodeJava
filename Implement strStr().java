//https://leetcode.com/problems/implement-strstr/description/
class Solution {
    public int strStr(String haystack, String needle) {
        //KMP
        if(needle.length()==0)
            return 0;
        char [] chs = needle.toCharArray();
        int [] next = new int[needle.length()];
        next[0] = -1;
        if(next.length>1)
            next[1] = 0;
        for(int i=2;i<next.length;i++){
            int index = next[i-1];
            char val = chs[i-1];
            while(index!=-1&&chs[index]!=val){
                index = next[index];
            }
            next[i] = index+1;
        }
        int cur1 = 0;
        int cur2 = 0;
        char [] chars = haystack.toCharArray();
        while(cur1<chars.length&&cur2<chs.length){
            if(cur2==-1||chars[cur1]==chs[cur2]){
                cur1++;
                cur2++;
            }
            else{
                cur2 = next[cur2];
            }
        }
        if(cur2<chs.length) return -1;
        else
            return cur1-chs.length;
    }
}