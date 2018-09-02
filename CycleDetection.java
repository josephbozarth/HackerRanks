/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node tort = head, hare = head;
    while(true){
        if(hare == null)
            return false;
        hare = hare.next;
        if(hare == null)
            return false;
        hare = hare.next;
        tort = tort.next;
        if(hare == tort)
            return true;
    }
}
