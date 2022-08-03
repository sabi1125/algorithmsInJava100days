class PalindromeNumber {
  // leetcode: No: 9: Palindrome Number;
  // difficulty: easy;
  public static boolean isPalindrome (int x) {
    if(x < 0) return false;
    String s = String.valueOf(x);
    StringBuilder reverse = new StringBuilder();
    for(int i = s.length() - 1; i >= 0; i--) {
      reverse.append(s.charAt(i));
    }
    if(Integer.parseInt(reverse.toString()) == x) {
      return true;
    }
    return false;
  }

  public static void main (String[] args) {
    System.out.print(isPalindrome(-12211));
  }
}
