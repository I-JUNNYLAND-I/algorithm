/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode pointer = head;
        int len = 0;
        while (pointer != null) {
            pointer = pointer.next;
            len++;
        }
        int half = (int)Math.round(len / 2);
        int index = 0;
        while (index < half) {
            head = head.next;
            index++;
        }
        return head;
    }
}