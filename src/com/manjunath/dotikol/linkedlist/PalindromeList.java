package com.manjunath.dotikol.linkedlist;

import com.manjunath.dotikol.linkedlist.LinkedListNode;

import java.util.*;
public class PalindromeList{
      public static boolean palindrome(LinkedListNode head) {
        // Write your code here
          LinkedListNode slow1 = head;
          LinkedListNode slow2= head;
          LinkedListNode fast1 = head;
          LinkedListNode fast2 = head;
          LinkedListNode middle = null;

          //Find the middle of the list
          while(fast1 != null && fast1.next != null) {
              slow1 = slow1.next;
              if(fast1.next.next == null){
                  fast1 = fast1.next;
              } else {
                  fast1 = fast1.next.next;
              }
          }
          middle = slow1;

          while(slow2 != middle) {
              if(slow2.data != fast1.data) {
                  return false;
              }
              slow2 = slow2.next;
              fast2 = middle;
              while(fast2.next != fast1) {
                  fast2 = fast2.next;
              }
              fast1 = fast2;
          }
        return true;
      }
}