package week1.Day6;

class TwiceOfOthers {
  public static int twiceOfOthers (int[] nums) {
    int max = 0;
    int res = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] > max) {
        max = nums[i];
        res = i;
      }
    }
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != max) {
        if(nums[i] * 2 > max){
          return -1;
        }
      }
    }
    return res; 
  }

  public static void main (String[] args) {
   System.out.println( twiceOfOthers(new int[] {3,6,1,0}));
  }
}
