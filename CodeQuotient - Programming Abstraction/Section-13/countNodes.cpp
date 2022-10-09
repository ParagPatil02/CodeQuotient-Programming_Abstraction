/*
Count the number of nodes in a circular linked list

Given a pointer to the head node of a circular linked list, print the total number of elements in it. Assume each node of the circular linked list has a unique key.


Sample Input:

The first line contains the number of element of the circular linked list, followed by the elements. The circular linked list below can be denoted as:

1 -> 2 -> 3 -> 1 where the last node 3 points to the first element 1 of the circular linked list.

3
1 2 3
*/




int countNodes(struct Node* head) {
   Node *temp = head;
   int result = 1;
   if (head != NULL){
   while(temp->next != head){
     temp = temp->next;
     result += 1;
   }}
  else{
    return 0;}
   return result;
}