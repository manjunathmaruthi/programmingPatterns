package com.manjunath.dotikol.linkedlist.reverse;

class LinkedListReversal{
    static LinkedListNode reverseLinkedList(LinkedListNode node){
		LinkedListNode previous = null;  
		LinkedListNode current = node;  
		LinkedListNode next = null;  
		
		while (current != null)   
		{ 
			// temporarily store the next node 
			next = current.next;  
			// reverse the current node
			current.next = previous;  
			// before we move to the next node, point previous to the
      		// current node
			previous = current; 
			// move to the next node 
			current = next;  
		}  
		node = previous;  
		return node;  
	}
}

