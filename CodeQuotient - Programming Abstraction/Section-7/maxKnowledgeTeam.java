/*
How much the team knows

Suppose, you are given X number of students and Y numbers of topics to have knowledge of. Each student may or may not have the knowledge of i'th topic where i ranges from 1 to Y. If you can make a team of students by choosing 2 students, what is the maximum number of topics a team can have knowledge of. Also find out the total number of such teams who have the knowledge of maximum number of topics.

Complete the function maxKnowledgeTeams() which takes the input as below and print the maximum number of topics a team can know and the maximum number of such teams in two separate lines

    X, an integer denoting the number of students.
    Y, an integer denoting the number of topics.
    Knowledge, a 2-d integer array of size X rows and Y columns, where entry (i, j) is 1 if ith student knows the jth topic, and 0 if he/she does not know.
 */


class Result {
    /*     
     * Complete the 'maxKnowledgeTeams' function below.
     * @params
     *   students -> number of students
     *   topics -> number of topics
     *   knowledge -> a 2-d integer list of size `students` rows and `topics` columns, 
     * 				where entry (i, j) is 1 if ith student knows the jth topic, 
     *				and 0 if he/she does not know
     *
     * Calculate and Print the required numbers in two lines.
     */
    public static void maxKnowledgeTeams(int students, int topics, List<List<Integer>> knowledge) {
      long maxpair = 0;
      long maxtopics = 0;
      for(int i = 0; i<students; i++){
        int max = 0;
        for(int j = i+1; j<students; j++){
          int count = 0;
          for(int k = 0; k<topics; k++){
            if(knowledge.get(i).get(k) == 1|| knowledge.get(j).get(k) == 1)
              count++;
          }
          if(max<count){
            max = count;
          }
        }
        if(maxtopics<max){
          maxtopics = max;
          maxpair = 1;
        }
        else if(max == maxtopics)
          maxpair++;
      }
      System.out.println(maxtopics);
      System.out.print(maxpair);
    }
  }