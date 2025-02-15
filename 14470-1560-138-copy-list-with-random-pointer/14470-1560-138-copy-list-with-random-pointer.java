/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node original = head;
        while(original != null){
            Node newNode = new Node(original.val);
            newNode.next = original.next;
            original.next = newNode;
            original = newNode.next;
        }

        original = head;
        while(original != null){
            if(original.random != null){
                original.next.random = original.random.next;
            }
            original = original.next.next;
        }

        original = head;
        Node copy = head.next;
        Node copyPointer = copy;

        while(original != null){
            original.next = copyPointer.next;
            original = original.next;
            if(original != null){
                copyPointer.next = original.next;
                copyPointer = copyPointer.next;
            }
        }

        return copy;
    }
}