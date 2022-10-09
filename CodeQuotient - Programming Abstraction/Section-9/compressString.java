/*
Compress a string

Given a sorted string, compress all the similar letters from the string. For example, aabbccdef is a sorted string in which alphabets are in increasing order from a to z and will become a2b2c2def after compression of similar characters.

Complete the function compressString(str) that will take the string as parameter and modify it as specified.
*/



class Result {
    static String compressString(String s) {
      String ans = "";
      for (int i = 0 ; i < s.length(); i++) {
        int count = 1;
        while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
          count++;
          i++;
        }
        ans += s.charAt(i);
        if (count > 1) {
          ans += count;
        }
      }
      return ans;
    }
  }