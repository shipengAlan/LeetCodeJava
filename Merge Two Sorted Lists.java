//https://leetcode.com/problems/merge-two-sorted-lists/description/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode res = null;
        ListNode cur = null;
        while(cur1!=null||cur2!=null){
            ListNode need = null;
            if(cur1==null||cur2==null){
                need = cur1==null?cur2:cur1;
                if(cur1!=null)
                    cur1 = cur1.next;
                else
                    cur2 = cur2.next;
            }
            else{
                need = cur1.val<cur2.val?cur1:cur2;
                if(cur1.val<cur2.val)
                    cur1 = cur1.next;
                else
                    cur2 = cur2.next;
            }
            if(res==null){
                res = need;
                cur = need;
            }
            else{
                cur.next = need;
                cur = cur.next;
            }
        }
        return res;
    }
}