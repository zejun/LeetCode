package com.solution;

import com.structure.ListNode;

public class ReorderList {
	
	public static void reorderList(ListNode head){
	
		ListNode middle = getMiddle(head);
		ListNode reverse = listReverse(middle.next);
		middle.next = null;
		
		//merge the reverse with head
		ListNode dummy = new ListNode(0);
		ListNode list1 = head;
		ListNode list2 = reverse;
		int index = 0;
		while(list1!=null&&list2!=null){
			if(index%2==0){
				dummy.next = list1;
				list1 = list1.next;
			}else{
				dummy.next = list2;
				list2 = list2.next;
			}
			
			dummy = dummy.next;
			index++;
		}
		if(list1!=null){
			dummy.next = list1;
		}else{
			dummy.next = list2;
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
