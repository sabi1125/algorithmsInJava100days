package week1.Day6;

class PivotIndex {
  public static int pivotIndex(int[] nums) {
    int right = 0;
    for(int i = 0; i < nums.length; i++) {
      right += nums[i];
    }
    int left = 0;
    for(int i = 0; i < nums.length; i++) {
      right -= nums[i];
      System.out.println(right);
      System.out.println(left);
      if(left == right) {
        return i;
      }
      left += nums[i];
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(pivotIndex(new int[] { 1,7,3,6,5,6 }));
  }
}
