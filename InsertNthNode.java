/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node origin = head;
    Node insert = new Node();
    insert.data = data;
    Node prev = head;
    int count = 0;
    if(position == 0){
        insert.next = head;
        return insert;
    }
    while(count++ < position){
        prev = head;
        head = head.next;
    }
    prev.next = insert;
    insert.next = head;
    return origin;
    
}
