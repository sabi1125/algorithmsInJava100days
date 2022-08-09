package Day4;

class EvenNumbers {
  public static int findNumbers(int[] nums) {
    int count = 0;
    for(int i = 0; i < nums.length; i++) {
      if(String.valueOf(nums[i]).length() % 2 == 0) {
        count++;
      }
    }
    return count;
  }

  public static void main (String[] args) {
    System.out.println(findNumbers(new int[] { 12,345,2,6,7896 }));
  }
}
