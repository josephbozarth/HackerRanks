/*
  Remove all duplicate elements from a sorted linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* RemoveDuplicates(Node *head)
{
    if(head == NULL){
        return head;
    }
    Node * curr = head;
    Node * prev = head;
    while(curr->next != NULL){
        curr = curr->next;
        if(curr->data == prev->data){
            prev->next = curr->next;
        }
        else{
            prev = curr;
        }
    }
    
    return head;
  // This is a "method-only" submission. 
  // You only need to complete this method. 
}
