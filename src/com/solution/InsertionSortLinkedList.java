package com.solution;

import com.structure.ListNode;

public class InsertionSortLinkedList {
	
	public static ListNode insertionSort(ListNode head){
		
		if(head==null||head.next==null){
			return head;
		}else{
			
			ListNode dummy = new ListNode(0);
			
			while(head!=null){
				
				ListNode node = dummy;
				
				while(node.next!=null&&node.next.val<=head.val){
					node = node.next;
				}
				
				ListNode temp = head.next;
				head.next = node.next;
				node.next = head;
				head = temp;
				
			}
			return dummy.next;
			
		}
		
		
	}

}
