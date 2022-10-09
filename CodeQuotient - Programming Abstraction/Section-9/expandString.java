/*
How do you like the content?

Your feedback is very essential for us to keep improving our content
Expand a string

Given a compressed string, you need to expand it in its original form. For example, if a2b3c2de is the given string, then it will become aabbbccde after expansion.

The integer value after an alphabet, in the given string, denotes how many times that alphabet should occur in the final string, and if there is no integer after an alphabet then it will occur only once.

Note: The maximum length of the expanded string will not be greater than 1000.
*/



class Result {
    static String expandString(String str) {
      if(str.length()<=1)
        return str;
      String ans="";
      String n="";
      for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch>='a' && ch<='z'){
          ans+=ch;
        }
        else{
          while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
            n+=str.charAt(i);
            i++;
          }
          if(n!=""){
            int num = Integer.parseInt(n);
            for(int j=0;j<(num-1);j++){
              ans+=ans.charAt(ans.length()-1);
            }
            n=new String("");
          }
          if(i<str.length())
            i--;
        }
      }
      return ans;
    }
  }