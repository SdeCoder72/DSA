class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp != null) {
            if(temp.child == null) temp = temp.next;
            else{
                
                Node a = temp.next;
                temp.child = flatten(temp.child);
                Node c = temp.child;
                temp.child = null;
                temp.next = c;
                c.prev = temp;
                Node tail = c;
                while(tail.next != null) tail = tail.next;
                tail.next = a;
                if(a != null) a.prev = tail;
                temp = a;
            } 
        }
        return head;
    }
}
