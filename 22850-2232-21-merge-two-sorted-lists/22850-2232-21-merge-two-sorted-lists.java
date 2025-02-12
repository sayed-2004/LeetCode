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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mergedNode = new ListNode(0);
        ListNode pointer = mergedNode;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                pointer.next = new ListNode(list1.val);
                list1 = list1.next;

            } else{
                pointer.next = new ListNode (list2.val);
                list2 = list2.next;
            }

            pointer = pointer.next;
        }

        // If any nodes are left in list1, append them
        while (list1 != null) {
            pointer.next = new ListNode(list1.val);
            pointer = pointer.next;
            list1 = list1.next;
        }

        // If any nodes are left in list2, append them
        while (list2 != null) {
            pointer.next = new ListNode(list2.val);
            pointer = pointer.next;
            list2 = list2.next;
        }
        return mergedNode.next;
    }
}