/*
Keyword Count

Given a string that contains lowercase and uppercase alphabets, along with the space character. Also given a word, count how many times the given word occurs in the given string.

Note: A word is a sequence of characters without any space.
*/



class Result {
    static int keywordCount(String str, String word) {
      String a[]= str.split(" ");
      int count=0;
      for(int i=0;i<a.length;i++){
        if(word.equals(a[i]))
          count++;
      }
       return count;
    }
  }