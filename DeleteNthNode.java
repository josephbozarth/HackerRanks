/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node origin = head;
    if(position == 0){
        head = head.next;
        return head;
    }
    int count = 0;
    Node prev = head;
    while(count++ < position){
        prev = head;
        head = head.next;
    }
    head = head.next;
    prev.next = head;
    return origin;

}

