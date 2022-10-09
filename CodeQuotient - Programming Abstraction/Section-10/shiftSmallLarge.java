/*
Move the Smallest and largest to head and tail of list

Given a pointer to the head node of a linked list, find the smallest and the largest element of this list. Now, move the smallest node to the front and move the largest node to the end of the list.

Example:

Input list:  head -> 5 -> 4 -> 7 -> 3 -> 2 -> 6 -> NULL
Output list: head -> 2 -> 5 -> 4 -> 3 -> 6 -> 7 -> NULL

Complete the function shiftSmallLarge(), which takes the head node of the linked list as a parameter, and returns the updated head pointer after doing both the shifts.
*/




static Node shiftSmallLarge(Node head) {
    if(head == null || head.next == null)
      return head;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    Node temp = head;
    Node tail = null;
    while(temp!= null){
      if(temp.data>max){
        max = temp.data;
      }
      if(temp.data<min){
        min = temp.data;
      }
      if(temp.next == null){
        tail = temp;
      }
      temp = temp.next;
    }
    Node prev = null;
    temp = head;
    while(temp.data !=max){
      prev = temp;
      temp = temp.next;
    }
    if(temp == head){
      head = head.next;
      tail.next = temp;
      temp.next = null;
    }
    if(temp!=head && temp.next != null){
      prev.next = temp.next;
      tail.next = temp;
      temp.next = null;
    }
    prev = null;
    temp =  head;
    while(temp.data != min){
      prev = temp;
      temp = temp.next;
    }
    if(temp != head && temp.next != null){
      prev.next = temp.next;
      temp.next = head;
      head = temp;
    }
    return head;
  }