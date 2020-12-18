/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode curr = pre;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        return pre.next;
    }
}