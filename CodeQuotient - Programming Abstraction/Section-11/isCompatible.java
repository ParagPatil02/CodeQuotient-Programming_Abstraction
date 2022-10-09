/*
Compatibility Test

Rohan and Aditi are about to get married, but before that they wanted to check their compatibility, so they decided to visit an astrologer. The astrologer asked them to think of a string in their mind, now according to him if Rohan's string occurs at the end of Aditi's string, then they are compatible otherwise not.

For example: If Aditi's string = "Face" and Rohan's string = "ace", then they are compatible because the second string occurs at the end of first string.

Complete the function areCompatible(aditi_str, rohan_str) which accepts two strings as parameter and returns 1 if rohan_str occurs at end of aditi_str and 0 otherwise.
*/





class Result {
    static int areCompatible(String aditi_str, String rohan_str) {
      int i = rohan_str.length()-1;
      int j = aditi_str.length()-1;
      if(i>j)
        return 0;
      while(i>=0){
        if(rohan_str.charAt(i) == aditi_str.charAt(j)){
          i--;
          j--;
        }
        else
          return 0;
      }
      return 1;
    }
  }