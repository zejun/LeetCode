package com.solution;

import java.util.HashMap;

import com.structure.*;

public class DeepCopyWithRandomPointer {

	public static RandomListNode solution(RandomListNode head){
		
		if(head==null)
			return null;
		
		HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
		RandomListNode dummy = new RandomListNode(0);
		RandomListNode pre = dummy,newNode;
		
		while(head!=null){
			//handle the random pointer
			if(map.containsKey(head)){
				map.get(head).next=head;
			}else{
				map.put(head.random, head);
			}
			pre = head;
			
			head=head.next;
			
		}
		
		
		return head.next;
	}
	
}
