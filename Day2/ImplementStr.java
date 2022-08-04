package Day2;
class ImplementStr {
  public static int implementStr(String haystack, String needle) {
    if ( haystack == null || needle == null || needle.length() > haystack.length() ) {
      return -1;
    }

    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
      if (haystack.charAt(i) == needle.charAt(0)) {
        if (haystack.substring(i, needle.length()+i).equals(needle)) return i;
      }
    }
    return -1;
  }

  public static void main (String[] args) {
    System.out.println(implementStr("bbbababbbbb", "aa"));
  }
}
