/*
Same Species OR Not

Scientists have found two creatures frozen in Siberia. The first one is around 5000 yrs old, and the second one is 2000 yrs old. Now they want to determine whether the two creatures belong to the same species or not, so for that scientists have done DNA sequencing of the both. Now if the DNA string of 2nd creature comes out to be a subsequence of 1st creature's DNA string, then they belong to the same species otherwise not. A subsequence of a string is defined as a string that can be obtained by deleting any number of characters from the original string.

Complete the function belongToSameSpecies(DNA_str1, DNA_str2) that accepts two strings as parameters, and returns true if the creatures belong to the same species, else returns false.
*/





class Result {
    static boolean belongToSameSpecies(String DNA_str1, String DNA_str2) {
      int res = 0;
      for(int i = 0; i<DNA_str1.length() && res<DNA_str2.length(); i++){
        if(DNA_str2.charAt(res) == DNA_str1.charAt(i))
          res++;
      }
      return(res == DNA_str2.length());
    }
  }