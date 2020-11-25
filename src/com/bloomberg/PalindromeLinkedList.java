package com.bloomberg;

public class PalindromeLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // 1->2->2->1

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode current = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode prev = null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        while (prev !=null && current != null){
            if(prev.val != current.val) return false;
            prev = prev.next;
            current = current.next;
        }
        return true;

    }
}
