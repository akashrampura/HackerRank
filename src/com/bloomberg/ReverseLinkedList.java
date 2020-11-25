package com.bloomberg;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
        // 1->2->3->4->5->NULL
        // 5->4->3->2->1->NULL

        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            while(head != null){
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }
    }
}
