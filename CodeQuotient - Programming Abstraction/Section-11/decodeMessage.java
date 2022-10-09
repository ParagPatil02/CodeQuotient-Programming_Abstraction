/*
Decode Enemy Message

Turing intercepts an encoded message from the enemy country, and he has cracked the logic to decode that. The decoding logic is as follows:

The encoded string is composed of multiple words which are separated by space, and to decode that, one needs to reverse the words in the string individually, not the whole string.

Turing needs your help in writing an algorithm to decode those intercepted messages.

Complete the function decodeMessage() which takes the string as parameter and reverse the individual words of string and returns it.
*/




class Result {
    static String decodeMessage(String str) {
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
      return reversedString;
    }
  }