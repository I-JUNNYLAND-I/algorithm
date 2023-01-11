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
    public int pairSum(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        while (head != null) {
            deque.add(head.val);
            head = head.next;
        }
        
        int max = 0;
        while (!deque.isEmpty()) {
            max = Math.max(max, deque.poll() + deque.pollLast());
        }
        
        return max;
    } 
}