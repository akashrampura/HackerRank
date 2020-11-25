package com.bloomberg;

import java.util.List;

public class AddTwoNumbers {
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

/*
*   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
* */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carry = 0;
        while(l1 != null || l2 != null){
              int l1Val = l1 == null ? 0 : l1.val;
              int l2Val = l2 == null ? 0 : l2.val;
              int sum = l1Val + l2Val + carry;
              carry = sum / 10;
              int lastDigit = sum % 10;
              ListNode newNode = new ListNode(lastDigit);
              l3.next = newNode;
              if(l1 != null) l1 = l1.next;
              if(l2 != null) l2 = l2.next;
              l3 = l3.next;
          }
        if(carry > 0){
            ListNode node = new ListNode(carry);
            l3.next = node;
            l3 = l3.next;
        }

    return dummy.next;
    }
}
