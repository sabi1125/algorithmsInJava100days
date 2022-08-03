class ReverseString {
  // day 1 of 100
  // practice reverse string in java
  public static String reverse(String str) {
    StringBuilder reverseString = new StringBuilder();
    for(int i = str.length() - 1; i >= 0; i--) {
      reverseString.append(str.charAt(i));
    }
    return reverseString.toString();
  }

  public static void main (String[] args) {
    System.out.print(reverse("pineapple"));
  }
}
