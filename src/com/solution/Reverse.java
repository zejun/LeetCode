package com.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

import com.structure.ListNode;

public class Reverse {
	
	public static ListNode reverseLinkedList(ListNode head){
		
		ListNode dummy = new ListNode(-1);
		
		while (head != null){
			ListNode tem = head.next;
			head.next = dummy.next;
			dummy.next = head;
			head = tem;
			
		}
		return dummy.next;
	}
	
	public static ListNode reverseLinkedListII(ListNode head, int m, int n){
		ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;
        
        for (int i = 1; i < m; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        
        ListNode premNode = head;
        ListNode mNode = head.next;
        ListNode nNode = mNode, postnNode = mNode.next;
        for (int i = m; i < n; i++) {
            if (postnNode == null) {
                return null;
            }
            ListNode temp = postnNode.next;
            postnNode.next = nNode;
            nNode = postnNode;
            postnNode = temp;
        }
        mNode.next = postnNode;
        premNode.next = nNode;
        
        return dummy.next;
	}

}
