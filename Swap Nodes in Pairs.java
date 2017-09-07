//https://leetcode.com/problems/swap-nodes-in-pairs/description/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode last = null;
        ListNode res = null;
        ListNode cur = head;
        ListNode first = cur;
        ListNode second = cur.next;
        ListNode next = second.next;
        second.next = first;
        first.next = next;
        res = second;
        last = first;
        cur = next;
        while(cur!=null&&cur.next!=null){
            first = cur;
            second = cur.next;
            next = second.next;
            second.next = first;
            first.next = next;
            last.next = second;
            last = first;
            cur = next;
        }
        return res;
    }
}