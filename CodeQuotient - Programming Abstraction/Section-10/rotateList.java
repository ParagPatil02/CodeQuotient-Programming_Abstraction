/*
Rotate a linked List

Given a singly linked list, rotate the list counter-clock wise by k nodes. For example,

If the given list is 1 -> 2 -> 3 -> 4 -> 5 -> 6 and k = 4, then the list must be modified to 5 -> 6 -> 1 -> 2 -> 3 -> 4.

Note: If k is greater than the size of the list, leave the list unchanged.
*/



static int sizeOf(Node head){
    if(head == null)
      return 0;
    return sizeOf(head.next) + 1;
  }
  static Node rotateList(Node head, int k) {
    int size = sizeOf(head);
    if(head == null || k<=0 || k>size )
      return head;
    k = k % size;
    if(k == 0)
      return head;
    Node temp = head;
    int i = 1;
    while(i<k){
      temp = temp.next;
      i++;
    }
    Node temp2 = temp.next;
    Node n = temp2;
    temp.next = null;
    while(temp2.next != null){
      temp2 = temp2.next;
    }
    temp2.next = head;
    return n;
  }