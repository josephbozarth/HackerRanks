/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

          int CompareLists(Node headA, Node headB) {
              // This is a "method-only" submission. 
              // You only need to complete this method 
              //Returns 1 if both heads are an empty list
              
              while(headA != null && headB != null && headA.data == headB.data){
                  headA = headA.next;
                  headB = headB.next;
                  }
                  if(headA == headB)
                    return 1;
                  return 0;
              
            
          }

