// Time Complexity - O(n)
// Space Complexity - O(n)

class Solution {
    private Node copyList(Node a){
        Node t1 = a;
        Node head = new Node(-1);
        Node t2 = head;
        while(t1 != null) {
            Node t = new Node(t1.val);
            t2.next = t;
            t2 = t2.next;
            t1 = t1.next;
        }
        return head.next;
    }
    public Node copyRandomList(Node head) {
        Node newHead= copyList(head);
        HashMap<Node, Node> map = new HashMap<>();
        map.put(null, null);
        Node temp1 = head;
        Node temp2 = newHead;
        while(temp1 != null) {
            map.put(temp1, temp2);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1 = head;
        while(temp1 != null) {
            temp2 = map.get(temp1);
            temp2.random = map.get(temp1.random);
            temp1 = temp1.next;
        }
        return newHead;
    }
}
