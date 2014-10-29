package com.solution;

import java.util.HashMap;

import com.structure.*;

public class DeepCopyWithRandomPointer {

	public static RandomListNode solution(RandomListNode head){
		
		if(head==null)
			return null;
		//hashmap<origin node, random node>
		HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
		RandomListNode dummy = new RandomListNode(0);
		RandomListNode pre = dummy,newNode;
		
		while(head!=null){
			//regular deep copy
			
			RandomListNode tem = new RandomListNode(head.label);
			
			//first node
			if(dummy.next==null){
				dummy.next = tem;
				pre = tem;
			}else{
				pre.next = tem;
			}
			
		}
		
		
		return dummy.next;
	}
	
}
