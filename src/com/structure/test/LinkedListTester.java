package com.structure.test;

import com.structure.RandomListNode;

public class LinkedListTester {

	//default constructor for loop
	public LinkedListTester(){
		
		
		
	}
	
	//iterator to print out all the elements
	public static void iterator(RandomListNode head){
		System.out.println("Test for random list node head "+head.label);
		while(head!=null){
			System.out.print(head.label+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	private void generator(){
		
		
		
	}
	
	private boolean tester(){
		return true;
	}
	
}
