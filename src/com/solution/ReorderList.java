package com.solution;

import com.structure.ListNode;

public class ReorderList {
	
	public static void reorderList(ListNode head){
	
		ListNode middle = getMiddle(head);
		ListNode reverse = listReverse(middle.next);
		
		//merge two list together
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		dummy = dummy.next;
		
		int index = 0;
		while(reverse!=null){
			if(index%2==0){
				dummy.next = head;
				head = head.next;
			}else{
				dummy.next = reverse;
				reverse = reverse.next;
			}
			
			index++;
		}
		if(head!=null){
			dummy.next = head;
		}else{
			dummy.next = reverse;
		}
		
	}
	
	public static ListNode getMiddle(ListNode head){
		
		if(head==null||head.next==null){
			return head;
		}
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while(fast.next!=null&&fast!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
		
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
