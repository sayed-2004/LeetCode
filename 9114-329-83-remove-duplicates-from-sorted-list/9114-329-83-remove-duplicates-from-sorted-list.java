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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode original = head;

        while(original != null && original.next != null){
            if(original.val == original.next.val){
                original.next = original.next.next;
            }else{
                original = original.next;
            }
        }
        return head;
        
    }
}