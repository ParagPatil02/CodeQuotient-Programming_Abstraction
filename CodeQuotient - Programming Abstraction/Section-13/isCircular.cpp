/*
Given list is circular or not

In circular list the last node points to the first node creating a loop of nodes. Now, given a pointer to the head node of a linked list, find out if it is circular or not.

Complete the function isCircular() given in the editor, which takes the head of the list as parameter and returns 1 if the linked list is circular and 0 otherwise.

Note: If the linked list is empty, then consider it as a circular linked list.
*/



int isCircular(Node* head) {
  if(head == NULL)
    return 1;
  if (head->next==NULL)
    return 0;
  Node *slow=head,*fast=head;
  while(fast != NULL && fast->next != NULL) {
    slow = slow->next;
    fast = fast->next->next;
    if(slow==fast)
      break;
  }
  if(fast == head)
    return 1;
  return 0;
}