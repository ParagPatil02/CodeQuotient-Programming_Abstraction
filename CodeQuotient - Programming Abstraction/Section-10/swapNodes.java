/*

How do you like the content?

Your feedback is very essential for us to keep improving our content
Swap Two Nodes of Doubly Linked List

Given a pointer to the head node of a doubly linked list and two keys, x and y respectively, swap these two nodes of the list (if these nodes exists in the list).

Note: All the linked list nodes contain distinct data.

Complete the function swapNodes(), which takes the head node of a doubly linked list along with x and y as a parameter, and returns the head of updated list after swapping the two nodes.
*/



Node swapNodes(Node head, int x, int y) {
    if(head == null || head.next == null)
      return head;
    Node temp = head;
    Node forX = null;
    Node forY = null;
    while(temp != null) {
      if(temp.data == x)
        forX = temp;
      if(temp.data == y) 
        forY = temp;
      temp = temp.next;
    }
    if(forX == null || forY == null)
      return head;
    forX.data = y;
    forY.data = x;
    return head;
  }