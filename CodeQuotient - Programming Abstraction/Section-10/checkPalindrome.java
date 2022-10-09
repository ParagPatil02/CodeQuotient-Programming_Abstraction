/*
Check List for Palindrome

Given a pointer to the head node of a linked list, check it is a palindrome or not.

Examples:

Palindrome List:     head -> 702 -> 59 -> 702 -> NULL
Palindrome List:     head -> 3 -> 4 -> 4 -> 3 -> NULL
Non Palindrome List: head -> 1 -> 2 -> 3 -> 1 -> NULL

Complete the function checkPalindrome() which takes the head node of a linked list as a parameter, and return 1 if the given list is a palindrome, and 0 otherwise.

Note: If the linked list is empty, return 0.
*/



class Result {
    static int checkPalindrome(Node head) {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      Node temp = head;
      while (temp != null) {
        arr.add(temp.data);
        temp = temp.next;
      }
      int i = arr.size() - 1;
      while (head != null) {
        if (head.data != arr.get(i)) 
          return 0;
        head = head.next;
        i--;
      }
      return 1;
    }
  }