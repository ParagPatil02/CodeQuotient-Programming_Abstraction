/*
Find the loop in Linked list

A linked list is a collection of nodes stored in memory through pointers. These pointers may or may not be replicated, which might result in a loop of nodes.

Given a linked-list as input, check whether it contains a loop or not. If there is a loop return the number of nodes in the loop, otherwise return 0.

Complete the function loopInList() which takes the head node of a linked list as a parameter, and returns the number of nodes in loop if exists, 0 otherwise.
*/


class Result {
    static int loopInList(Node head) {
      if(head==null||head.next==null||head.next.next==null){
        return 0;
      }
      Node slow= head;
      Node fast=head.next.next;
      while(slow!=null && fast!=null && fast.next!=null && slow!=fast){
        slow=slow.next;
        fast=fast.next.next;
      }
      if(slow==null || fast==null || fast.next==null){
        return 0;
      }
      slow=slow.next;
      int count =1;
      while(slow!=fast){
        count++;
        slow=slow.next;
      }
      return count;
    }
  }