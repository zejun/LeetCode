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
		
		RandomListNode dummy = new RandomListNode(0);
		RandomListNode temHead = head;
		
		//copy the linked list with double 
		while(true){
			
			RandomListNode current = new RandomListNode(head.label);
			//check first element
			if(dummy.next==null)
				dummy.next = head;
			
			//check if current is end of linked list 
			if(head.next==null){
				head.next = current;
				break;
			}else{
				RandomListNode tem = head.next;
				head.next = current;
				current.next = tem;
				
			}
			
			head = head.next.next;
		}
		
		//second loop to modify the temHead
		head = temHead;
		boolean original = true;
		RandomListNode pre = head;
		while(head!=null){
			if(original){
				pre = head;
				original = false;
				head = head.next;
			}else{
				head.random = pre.random.next;
				original = true;
				head = head.next;
			}
		}
		
		//recover the linked list
		
		
		
		return dummy.next;
	}
	
}
