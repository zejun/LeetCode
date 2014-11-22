package com.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

import com.structure.ListNode;

public class Reverse {
	
	public static ListNode reverseLinkedList(ListNode head){
		
		ListNode newHead = null;
        while (head != null) {
            ListNode tem = head.next;
            head.next = newHead;
            newHead = head;
            head = tem;
        }
        return newHead;
		
	}

}
