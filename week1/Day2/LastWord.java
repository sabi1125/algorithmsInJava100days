package Day2;
class LastWord {
  public static int lengthOfLastWord(String s) {
    int p = s.length(), length = 0;
    while (p > 0) {
      p--;
      if (s.charAt(p) != ' ') {
        length++;
      } else if (length > 0) {
        return length;
      }
    }
    return length;
  }

  public static void main (String[] args) {
    System.out.println(lengthOfLastWord("   fly me to the moon    "));
  }
}
