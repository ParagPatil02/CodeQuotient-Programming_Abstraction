/*
Check the numbers for power of 2

Given a list of numbers check which of the numbers are power of 2 and which are not. For example, Given (1, 3, 4, 7, 8) You should return another list having (1, 0, 1, 0, 1) as 1, 4, 8 are power of 2 (2^0, 2^2, 2^3), and 3 & 7 are not.

So complete the function findPowers() which accepts the array as parameter and return another array as shown above.
*/



bool p2(int n)
{
    if (n == 1)
        return true;
    else if (n % 2 != 0 || n == 0)
        return false;
    return p2(n / 2);
}
vector<int> findPowers(vector<int> nums) {
  vector<int> ans(nums.size());
  for(int i  = 0; i<nums.size(); i++)
  {
    if(p2(nums[i])==true)
      ans[i] = 1;
    else
      ans[i] = 0;
  }
  return ans;
}