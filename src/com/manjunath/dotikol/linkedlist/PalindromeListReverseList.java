package com.manjunath.dotikol.linkedlist;

public class PalindromeListReverseList {
      public static boolean palindrome(LinkedListNode head) {
        // Write your code here
          LinkedListNode slow = head;
          LinkedListNode fast = head;

          //Find the middle of the list
          while(fast != null && fast.next != null) {
              slow = slow.next;
              fast = fast.next.next;
          }
          LinkedListNode middle = slow;
          LinkedListNode prev = null;
          LinkedListNode curr= middle.next;

          //Reverse the half of the list
          while(curr != null) {
              LinkedListNode next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }
          slow = head;
          fast = middle;
          while(slow != null && fast != null) {
              if(slow.data != fast.data) {
                  return false;
              } else  {
                  slow = slow.next;
                  fast = fast.next;
              }
          }
        return true;
      }
}