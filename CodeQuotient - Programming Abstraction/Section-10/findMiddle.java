/*
Find the middle node of the list

Given a pointer to the head node of a linked list, find the middle node of the list.

Complete the findMiddle(head) function: Return the middle node if number of nodes in linked list in odd, otherwise there will be two middle nodes and return the second middle node (return NULL if list is empty).

Note: you need to find the middle node of the list in just one traversal.
*/




static Node findMiddle(Node head) {
    if(head != null){
        Node n = head;
        int count = 0;
        while(n.next != null){
        n = n.next;
        count++;
      }
      int mid = (count+1) /2;
      while(mid!=0){
        head = head.next;
        mid--;
      }
      return head;
    }
   else
     return head;
  }