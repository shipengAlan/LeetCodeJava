//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        int cur = 0;
        int last = 0;
        while(cur<nums.length){
            nums[last] = nums[cur];
            len++;
            cur++;
            last++;
            while(cur<nums.length&&nums[cur]==nums[cur-1])
                cur++;
        }
        return len;
    }
}