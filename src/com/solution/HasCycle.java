package com.solution;

import java.util.HashMap;

import com.structure.ListNode;

public class HasCycle {
	
	public static boolean hasCycle(ListNode head){
		
		HashMap<ListNode,Boolean> record = new HashMap<ListNode,Boolean>();
		
		while(head!=null){
			if(record.get(head)!=null&&record.get(head)==true){
				return true;
			}else{
				record.put(head, true);
			}
			head = head.next;
		}
		
		return false;
	}

}
