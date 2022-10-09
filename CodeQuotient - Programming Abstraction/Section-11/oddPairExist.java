/*
String Odd Pairs

Given a string, determine if a pair of adjacent odd numbers exists anywhere in the string or not. For example, if the string is "him643@gupta97", then the answer will be YES because it contains two adjacent odd numbers, i.e. 9 and 7. Similarly, if the string is "c18oa543y", then also the answer will be YES because it contains two adjacent odd numbers, i.e. 5 and 43.
*/




class Result {
    static boolean oddPairExists(String str) {
      for(int i = 0; i<str.length(); i++){
        String n = "";
        int count = 0;
        while(i<str.length() && str.charAt(i) >= '0' && str.charAt(i)<='9'){
          n += str.charAt(i);
          int temp = Integer.parseInt(n);
          if(temp%2 == 1){
            count++;
            n = "";
          }
          i++;
        }
        if(count >= 2)
          return true;
      }
      return false;
    }
  }