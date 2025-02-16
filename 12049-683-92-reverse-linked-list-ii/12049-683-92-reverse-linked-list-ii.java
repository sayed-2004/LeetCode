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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode left_pre = dummy;
        ListNode curr_node = head;

        for(int i = 0; i < left-1; i++){
            left_pre = left_pre.next;
            curr_node = curr_node.next;

        }

        ListNode sub_list_head = curr_node;

        ListNode prev_node = null;
        for(int i = 0; i <= right-left; i++){
            ListNode next_node = curr_node.next;
            curr_node.next = prev_node;
            prev_node = curr_node;
            curr_node = next_node;
        }

        left_pre.next = prev_node;
        sub_list_head.next = curr_node;

        return dummy.next;
        
    }
}