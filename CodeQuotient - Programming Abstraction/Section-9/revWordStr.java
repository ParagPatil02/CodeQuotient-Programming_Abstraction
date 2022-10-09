/*
Reverse the words of a string

A string is composing some words. These words are separated by some delimiter e.g. a space.

Given a string (with space as a delimiter between words), reverse the words in the string individually, not the whole string.

Complete the function revWordsString() which takes the string as parameter and reverse the individual words of string and print them.
*/



class Result {
    static void revWordsString(String str) {
      String words[] = str.split("\\s");
      String reversedString = "";
      for (int i = 0; i < words.length; i++) 
      {
        String word = words[i];
        String reverseWord = "";
        for (int j = word.length() - 1; j >= 0; j--) {
          reverseWord = reverseWord + word.charAt(j);
        }
        if(i==words.length-1){
          reversedString = reversedString + reverseWord;
          continue;
        }
        reversedString = reversedString + reverseWord + " ";
      }
      System.out.println( reversedString);
    }
}