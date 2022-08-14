package week2.Day4;

import java.util.Set;

class MergeList {
  public static ListNode mergeList(ListNode l1, ListNode l2) {
    if(l1 == null) {
      return l2;
    }
    else if(l2 == null) {
      return l1;
    }
    else if(l1.val < l2.val) {
      l1.next = mergeList(l1.next, l2);
      return l1;
    }
    else {
      l2.next = mergeList(l1, l2.next);
      return l2;
    }
  }
}
