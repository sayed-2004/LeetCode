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
        /*ListNode original = head;
        ArrayList<Integer> list = new ArrayList<>();

        while(original != null){
            list.add(original.val);
            original = original.next;
        }

        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) == list.get(i+1)){
                list.remove(i);
                list.remove(i+1);
                i++;
            }
        }

        ListNode dummy = new ListNode(0); 
        ListNode current = dummy; 

        for (int num : list) {  
            current.next = new ListNode(num); 
            current = current.next; 
        }

        return dummy.next;*/

        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode original = head;

        while(original != null){
            map.put(original.val, map.getOrDefault(original.val, 0) + 1);
            original = original.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        original = head;  // Reset pointer to head

        while (original != null) {
            if (map.get(original.val) == 1) {
                current.next = new ListNode(original.val);
                current = current.next;
            }
            original = original.next;
        }

        return dummy.next;
        
    }
}