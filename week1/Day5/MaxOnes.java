package Day5;
class MaxOnes {
  public static int maxOnes(int[] nums) {
    int ls = 0;
    int left = 0;
    int right = 0;
    int numZeroes = 0;
    while (right < nums.length) {
      if (nums[right] == 0) {
        numZeroes++;
      }

      while (numZeroes == 2) {
        if (nums[left] == 0) {
          numZeroes--;
        }
        left++;
      }
      ls = Math.max(ls, right-left +1);
      right++;
    }
    return ls;
  }

  public static void main (String[] args) {
   System.out.println( maxOnes(new int[] {1,0,1,1,0,1}));
  }
}
