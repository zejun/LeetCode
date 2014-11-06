package com.solution;

import java.util.HashMap;

import com.structure.*;

public class DeepCopyWithRandomPointer {

	public static RandomListNode solution(RandomListNode head){
		
		if(head==null)
			return null;
		
		//first method copy with two iteration
		//first iteration copy the regular add hash map to store all the point object
		HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
		RandomListNode dummy = new RandomListNode(0);
		RandomListNode current = head;
		RandomListNode pre = dummy;
		
		while(head!=null){
			//build up current item
			if(map.containsKey(head)){
				current = map.get(head);
			}else{
				current = new RandomListNode(head.label);
			}
			
			//test for first item
			if(dummy.next==null){
				dummy.next = current;
			}else{
				pre.next = current;
			}
			
			//handle random pointer
			if(head.random!=null){
				if(map.containsKey(head.random)){
					current.random = map.get(head.random);
				}else{
					RandomListNode newNode = new RandomListNode(head.random.label);
					map.put(head.random, newNode);
					current.random = newNode;
				}
			}
			
			pre = current;
			head = head.next;
		}
		
		
		return dummy.next;
		
	}
	
	//solution without hashmap
	public static RandomListNode solutionII(RandomListNode head){
		
		if(head==null)
			return null;
		
		RandomListNode current = head;
		
		while(current!=null){
			
			RandomListNode new_node = new RandomListNode(current.label);
			
			new_node.next = current.next;
			current.next = new_node;
			current = new_node.next;
		}
		
		current = head;
		while(current!=null){
			if(current.random!=null){
				current.next.random = current.random.next;
			}
			current = current.next.next;
		}
		
		current = head;
		RandomListNode new_head = head.next;
		RandomListNode copied_current = new_head;
		
		while(current!=null){
			copied_current = current.next;
			current.next = copied_current.next;
			
			if(copied_current.next!=null){
				copied_current.next = copied_current.next.next;
			}
			
			current = current.next;
		}
		return new_head;
	}
	
}
