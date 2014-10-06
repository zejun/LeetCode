package com.test;


import com.solution.*;

import com.structure.*;

public class Test {
	
	public static void main(String args[]){
		System.out.println("Test method");
		
		
		/**
		 * test for binary tree post order traversal 
		 */
		
		
		
		
		/**
		 * test for LRU cache
		 */
//		LRUCacheLinkedList testCache = new LRUCacheLinkedList(7);
//		
//		testCache.set(1, 10);
//		testCache.set(2, 20);
//		testCache.set(3, 30);
//		testCache.set(4, 40);
//		testCache.set(5, 50);
//		testCache.set(6, 60);
//		testCache.set(5, 50);
//		testCache.set(2, 20);
//		testCache.set(7, 70);
//		testCache.set(8, 80);
//		testCache.set(9, 90);
//		
//		System.out.println("Get key 1 value "+testCache.get(1));
//		System.out.println("Get key 8 value "+testCache.get(8));
//		System.out.println("Get key 7 value "+testCache.get(7));
//		System.out.println("Get key 10 value "+testCache.get(10));
//		
//		int index = 0;
//		DataPair tem = testCache.head;
//		while(tem!=null){
//			System.out.println("Index "+index+" value "+tem.val);
//			tem = tem.next;
//			index++;
//		}
		

		
		
		
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(4);
		a.next=b;
		b.next=c;
		
		SortLinkedList.sortList(a);
		
		while(a.next!=null){
			System.out.println(a.val);
		}

//		int index = 1;
//		while(!testCache.cache.isEmpty()){
//			LRUCache.DataPair tem = testCache.cache.pop();
//			System.out.println("Pop "+index+" key "+tem.key+" value "+tem.val);
//			index++;
//		}
		
//		for(int i=1;i<=6;i++){
//			System.out.println("value "+i+" is "+testCache.get(i));
//		}
		
		
		/**
		 * Test sorted linked list
		 */
//		ListNode a = new ListNode(2);
//		ListNode b = new ListNode(1);
//		ListNode c = new ListNode(4);
//		ListNode d = new ListNode(8);
//		a.next=b;
//		b.next=c;
//		c.next=d;
//		
//		//ListNode e = SortLinkedList.sortList(a);
//		ListNode e = InsertionSortLinkedList.insertionSort(a);
//		
//		
//		while(e!=null){
//			System.out.println(e.val);
//			e=e.next;
//		}

		
		//print linked list
		
		/**
		 * test maximum number on the same line
		 */
		
//		PointGenerator pg = new PointGenerator(3);
//		pg.getPoints();	
//		
//		pg.addPoints(1,1);
//		pg.addPoints(1,2);
//		pg.addPoints(2,3);
//		pg.addPoints(50,50);
//		pg.addPoints(40,40);
		//pg.printPoint();
		
//		int result = MaxPointOnALine.maxPoint(pg.getPoints());
		
		 
//		System.out.println("Maximum # of points in same line "+result);
		
		
		
	}

}
