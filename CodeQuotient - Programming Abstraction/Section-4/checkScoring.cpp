/*
Scoring based on difficulty level

A teacher has set N questions for an exam, and now she wants to map each question with a certain score. Noting that from question 1 to question N the difficult level keeps on increasing, so she decided that the score of each question must be greater or equal to the sum of scores of all lower difficulty questions.

Now, given an array denoting the score of each question from 1 to N, check whether the scoring is done correctly or not. For example, if the scores array is {1, 3, 6, 13, 54}, then print "YES" because the score of each question is as per the above description. But, if the array is {1, 3, 6, 8, 20}, then print "NO" because the score of fourth question is less than the sum of scores of all lower difficulty questions (i.e. 1 + 3 + 6 = 10).
*/


bool checkScoring(vector<int> score, int N) {
  int arr[N-1];
  arr[0] = score[0];
  for(int i  = 1; i<N; i++){
    arr[i]=arr[i-1]+score[i];
  }
  for(int i = 1; i<N; i++){
    if(score[i]<arr[i-1]){
      return false;
    }
  }
  return true;
}