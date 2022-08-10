package week1.Day7;

class LengthOfLastWord {
  public static int lastWord (String s) {
    int p = s.length() - 1;
    while (p >= 0 && s.charAt(p) == ' ') {
      p--;
    }

    int length = 0;
    while (p >= 0 && s.charAt(p) != ' ') {
      p--;
      length++;
    }
    return length;
  }

  public static void main (String[] args) {
    lastWord("Hello World");
  }
}
