package com.solution;

import java.util.HashMap;

import com.structure.*;

public class DeepCopyWithRandomPointer {

	public static RandomListNode solution(RandomListNode head){
		
		if(head==null)
			return null;
		
		//first method copy with two iteration
		//first iteration copy the regular add hash map to store all the point object
		RandomListNode dummy = new RandomListNode(0);
		RandomListNode tem = head;
		RandomListNode pre;
		
		while(tem!=null){
			//build up current item
			RandomListNode current = tem;
			
			//test for first item
			if(dummy.next==null){
				pre = tem;
				dummy.next = current;
			}
			
			
		}
		
		
		return null;
		
	}
	
}
