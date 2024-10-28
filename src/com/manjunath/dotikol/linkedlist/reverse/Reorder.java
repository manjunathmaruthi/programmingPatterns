package com.manjunath.dotikol.linkedlist.reverse;

import java.util.Arrays;
import java.util.List;

class Reorder {

        public static void reverseKGroups(LinkedListNode head, int k) {

        // Create a dummy node and set its next pointer to the head    
        LinkedListNode dummy = new LinkedListNode(0);
        dummy.next = head;
        LinkedListNode ptr = dummy;

        while (ptr != null) {
            System.out.println("\tIdentifying a group of " + k + " nodes:");
            System.out.println("\t\tptr: " + ptr.data);

            // Keep track of the current position
            LinkedListNode tracker = ptr;

            System.out.print("\t\tCurrent group: ");

            // Traverse k nodes to check if there are enough nodes to reverse
            for (int i = 0; i < k; i++) {
                if (tracker == null) {
                    break;
                }
                tracker = tracker.next;
                if (tracker != null) {
                    System.out.print(tracker.data + " ");
                } else {
                    System.out.print("");
                }
            }

            // If there are not enough nodes to reverse, break out of the loop
            if (tracker == null) {
                System.out.println("\n\t\tThe above group contains less than " + k + " nodes, so we can't reverse it.\n");
                break;
            } else {
                System.out.println("\n\t\tThe above group of " + k + " nodes can be reversed.\n");
            }

            ptr = tracker;

        }
    }

	    
	public static void main(String[] args) {
		
		List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int k = 3;
        LinkedList inputLinkedList = new LinkedList();
		inputLinkedList.createLinkedList(inputList);

        System.out.print("Linked list: ");
        PrintList.printListWithForwardArrow(inputLinkedList.head);
        System.out.print("\n");
        System.out.println();

        reverseKGroups(inputLinkedList.head, k);
	}
}