/*
Rearrange the Even-Odd Nodes of Doubly Linked List

Given a pointer to the head node of a doubly linked list, rearrange the nodes of list such that all even positioned nodes are shifted before odd positioned nodes while keeping their relative order same as in the original list.

Note: The head node of the list is at position 1 i.e. odd position

Complete the function rearrangeList(), which takes the head node of a doubly linked list as a parameter, and returns the head of updated list after rearranging it.
*/



static Node rearrangeList(Node head) {
    if(head == null || head.next == null)
      return head;
    Node temp = head;
    Boolean flag = true;
    Node even = null;
    Node evenTail = null;
    Node odd = null;
    Node oddHead = temp;
    head = temp.next;
    while(temp != null && temp.next != null) {
      flag = !flag;
      if(flag) {
        odd = temp.next;
        temp.next = temp.next.next;
        temp = odd;
      }
      else {
        even = temp.next;
        temp.next = temp.next.next;
        temp = even;
      }
    }
    evenTail = even;
    evenTail.next = oddHead;
    return head;
  }