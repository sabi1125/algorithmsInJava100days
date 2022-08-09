package Day4;

class MaxConsecutiveOnes {
  public static int maxOnes(int[] nums) {
    int count = 0;
    int maxOnes = 0;
    for( int i = 0; i < nums.length; i++ ) {
      if( nums[i] == 1 ) {
        count++;
      } else if (nums[i] != 1) {
        count = 0;
      }
    if(count > maxOnes) {
      maxOnes = count;
    }
    }
    return maxOnes;
  }

  public static void main (String[] args) {
    System.out.println(maxOnes(new int[] { 1,1,0,1,1,1 }));
  }
}
