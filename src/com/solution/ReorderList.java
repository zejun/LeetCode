package com.solution;

import com.structure.ListNode;

public class ReorderList {
	
	public static void reorderList(ListNode head){
		
	}
	
	public static ListNode listReverse(ListNode head){
		
		if(head==null||head.next==null){
			return head;
		}
		
		ListNode reverse_head = null;
		
		while(head!=null){
			ListNode tem = head.next;
			head.next = reverse_head;
			reverse_head = head;
			head = tem;
		}
		
		return reverse_head;
		
	}

}
