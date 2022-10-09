/*
Remove Duplicates from a sorted doubly linked list

A sorted doubly linked list is given to you. Your task is to remove the duplicate nodes from this list.

The function removeDupsDLL() takes the head node of a doubly linked list as a parameter, and returns the head of updated list after deleting the duplicate elements from it.
*/



class Result {
    static Node removeDupsDLL(Node head) {
      Node temp = head; 
      while( temp != null && temp.next != null ){
          if( temp.data == temp.next.data){
              temp.next = temp.next.next;
          }else{
              temp = temp.next;
          }
      }
      return head;
    }
  }