/*
Vowel Substrings

Given a string, count the number of substrings in it which starts from a vowel (‘a’, ‘e’, ‘i’, ‘o’, ‘u’, ‘A’, ‘E’, ‘I’, ‘O’, ‘U’).

As the number of the substrings can be very large, print the count modulo(%) 10007. 
*/



class Result {
    static int countVowelSubstr(String str) {
      int count = 0, n = str.length();
      char[] Str = str.toCharArray();
      for (int i = 0; i < n; i++){
        if (Str[i] == 'a' || Str[i] == 'e' || Str[i] == 'i' || Str[i] == 'o' || Str[i] == 'u' || Str[i] == 'A' || Str[i] == 'E' || Str[i] == 'I' || Str[i] == 'O' || Str[i] == 'U'){
                  count = (count + (n - i) % 10007) % 10007;
             }
         }
         return count;
    }
  }