package com.test;


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.solution.*;
import com.structure.*;
import com.structure.test.LinkedListTester;

public class Test {
	
	public static void main(String args[]){
		System.out.println("Test method");
		
		/**
		 * Test for clone the graph
		 */
		
		
		
		/**
		 * Test for gas station
		 */
//		int gas[] = {1,2,3,3};
//		int cost[] = {2,1,5,1};
//		int testResult = GasStation.solutionII(gas, cost);
//		System.out.println("The result is "+testResult);
		
		
		
		/**
		 * Test method for candy
		 */
//		int[] test = {1,2,3};
//		int result = Candy.solution(test);
//		System.out.println("The result is "+result);
		
		/**
		 * Test for single number
		 */
//		int[] test = {1,2,2,2,3,3,3,4,4,4};
//		//int res = SingleNumber.solutionII(test);
//		int res = SingleNumber.singleNumberII(test);
//		System.out.println("The result is "+res);
		
		/**
		 * Test for random linked list
		 */
		//build up random linked list 
//		RandomListNode n1 = new RandomListNode(1);
//		RandomListNode n2 = new RandomListNode(2);
//		RandomListNode n3 = new RandomListNode(3);
//		RandomListNode n4 = new RandomListNode(4);
//		RandomListNode n5 = new RandomListNode(5);
//		
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		
//		n1.random = n3;
//		n2.random = n1;
//		n3.random = n2;
//		n4.random = n5;
//		n5.random = n2;
//		
////		LinkedListTester.iterator(n1);
////		RandomListNode test1 = DeepCopyWithRandomPointer.solution(n1);
////		LinkedListTester.iterator(test1);
////		LinkedListTester.randomIterator(n1);
////		LinkedListTester.randomIterator(test1);
//		
//		LinkedListTester.iterator(n1);
//		RandomListNode test = DeepCopyWithRandomPointer.solutionII(n1);
//		LinkedListTester.iterator(test);
//		LinkedListTester.randomIterator(n1);
//		LinkedListTester.randomIterator(test);
		
		
		/**
		 * Test for word break 
		 */
//		String s = "leetcode";
//		String[] dictStr = {"lee","tcode","leet","code"};
//		
//		Set<String> dict = new HashSet<String>();
//		for(int i=0;i<dictStr.length;i++){
//			dict.add(dictStr[i]);
//		}
//		
//		
//		//System.out.println(s.substring(1,2));
//		
//		System.out.println(WordBreak.wordBreakII(s, dict));
		
		
		/**
		 * test for reorder the list
		 */
//		ListNode a = new ListNode(1);
//		ListNode b = new ListNode(2);
//		ListNode c = new ListNode(3);
//		ListNode d = new ListNode(4);
//		ListNode e = new ListNode(5);
//		ListNode f = new ListNode(6);
//		
//		a.next=b;
//		b.next=c;
//		c.next=d;
//		d.next=e;
//		e.next=f;
//		f.next=c;
		
		//ListNode e = SortLinkedList.sortList(a);
		//ReorderList.reorderList(a);
		
		
//		while(a!=null){
//			System.out.println(a.val);
//			a=a.next;
//		}
		
//		System.out.println(HasCycle.hasCycle(a));
		
		//test for get middle 
		//System.out.println("Get middle "+ReorderList.getMiddle(a).val);
		
		
		
		
		/**
		 * test for binary tree post order traversal 
		 */
//		TreeNode treeNode1 = new TreeNode(1);
//		TreeNode treeNode2 = new TreeNode(2);
//		TreeNode treeNode3 = new TreeNode(3);
//		TreeNode treeNode4 = new TreeNode(4);
//		TreeNode treeNode5 = new TreeNode(5);
//		TreeNode treeNode6 = new TreeNode(6);
//		TreeNode treeNode7 = new TreeNode(7);
//		
//		
//		treeNode1.left = treeNode2;
//		treeNode1.right = treeNode3;
//		treeNode3.right = treeNode4;
//		treeNode3.left = treeNode7;
//		treeNode4.left = treeNode5;
//		treeNode4.right = treeNode6;
//		
//		//List<Integer> testInteger = BinaryTreePostOrderTraversal.postOrderTraversalIteratively(treeNode1);
//		//List<Integer> testInteger = BinaryTreePreOrderTraversal.binaryTreePreorder(treeNode1);
//		List<Integer> testInteger = BinaryTreePreOrderTraversal.binaryTreePreorderTravel(treeNode1);
//		
//		
//		for(Integer result:testInteger){
//			
//			System.out.println("Iter info is "+result);
//			
//		}
		
		
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
		

		
		
		
//		ListNode a = new ListNode(3);
//		ListNode b = new ListNode(2);
//		ListNode c = new ListNode(4);
//		a.next=b;
//		b.next=c;
//		
//		SortLinkedList.sortList(a);
//		
//		while(a.next!=null){
//			System.out.println(a.val);
//		}

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
