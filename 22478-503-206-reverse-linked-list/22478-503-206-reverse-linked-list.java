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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode original = head;

        while(original != null){
            values.add(original.val);
            original = original.next;
        }

        original = head;
        for(int i = values.size()-1; i >= 0; i--){
            original.val = values.get(i);
            original = original.next;
        }

        return head;
    }
}