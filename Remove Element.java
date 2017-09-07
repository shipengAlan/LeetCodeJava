//https://leetcode.com/problems/remove-element/description/
class Solution {
    public int removeElement(int[] nums, int val) {
        int len =  0;
        int last = 0;
        int cur = 0;
        while(cur<nums.length){
            if(nums[cur]==val){
                cur++;
            }
            else{
                if(last<cur)
                    nums[last] = nums[cur];
                cur++;
                last++;
                len++;
            }
        }
        return len;
    }
}