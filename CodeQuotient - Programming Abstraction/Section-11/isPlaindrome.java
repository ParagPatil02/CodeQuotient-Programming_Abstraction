/*
Palindrome Sentence

Palindrome is a sequence of characters which reads the same backward as forward. Now, given a sentence, determine if it's a palindrome or not. Note that, the sentence may also contain punctuations and other symbols, but you only need to consider the sequence of English letters and digits while checking for palindrome.

For example, both the following sentences are palindromes:

"Mr. Owl ate my metal-worm"

"Do geese see God?"
*/





import java.util.*;
class Result {
  static boolean isPalindrome(String s) {
    StringBuilder sb1 = new StringBuilder();
    for(char c: s.toCharArray())
      if(Character.isLetterOrDigit(c)) 
        sb1.append(Character.toLowerCase(c));
    return sb1.toString().equals(sb1.reverse().toString());
  }
}