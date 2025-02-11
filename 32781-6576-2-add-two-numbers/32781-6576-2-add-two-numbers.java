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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = null; // Head of the result linked list
        ListNode last = null; // Tail pointer to keep track of last node
        int carry = 0; // Carry for sum greater than 9

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; 

            if (l1 != null) { 
                sum += l1.val;
                l1 = l1.next; 
            }
            if (l2 != null) { 
                sum += l2.val;
                l2 = l2.next; 
            }

            carry = sum / 10; 
            int lastDigit = sum % 10; 

            ListNode newNode = new ListNode(lastDigit);

            if (first == null) { 
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
        }

        return first;
    }
}