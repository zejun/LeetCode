package com.test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import com.solution.*;
import com.solution.test.DynamicProgramTest;
import com.structure.*;
import com.structure.test.LinkedListTester;

public class Test {
	
	public static void main(String args[]){
		System.out.println("Test method");
		/**
		 * Test for palindrome sepration
		 */
		List<List<String>> test = Array.partition("a");
		for (int i = 0; i < test.size(); i++){
			for (int j = 0; j < test.get(i).size(); j++){
				System.out.print("\""+test.get(i).get(j)+"\" ");
			}
			System.out.println();
		}
		
		/**
		 * Test function for array permutation
		 */
//		ArrayList<Integer> test = new ArrayList<Integer>();
//
//		int[] testData = {6, 2, 3};
//		
//		for (int i = 0; i < testData.length; i++){
//			test.add(testData[i]);
//		}
//		Collections.sort(test);
//		for (int i = 0; i < test.size(); i++){
//			System.out.print(test.get(i)+" ");
//			
//		}
//		System.out.println();
//		ArrayList<ArrayList<Integer>> result = Array.permutation(test);
//		
//		for (int i = 0; i < result.size(); i++){
//			for (int j = 0; j < result.get(i).size(); j++){
//				System.out.print(result.get(i).get(j)+" ");
//			}
//			System.out.println();
//		}

		
		/**
		 * Test for 3 sum slosest
		 */
//		int[] test = {1,2,33,23,2423,33,23,1,7,6,8787,5,33,2,3,-23,-54,-67,100,400,-407,-500,-35,-8,0,0,7,6,0,1,2,-56,-89,24,2};
//		int result = Sum.threeSumClosest(test, 148);
//		System.out.println(result);
		
		
//		ArrayList<Integer> test = new ArrayList<Integer>();
//		test.add(3);
//		test.add(4);
//		test.add(8);
//		test.add(5);
		
		
//		int[] testData = {828,125,740,724,983,321,773,678,841,842,875,377,674,
//				144,340,467,625,916,463,922,255,662,692,123,778,766,254,559,480,
//				483,904,60,305,966,872,935,626,691,832,998,508,657,215,162,858,
//				179,869,674,452,158,520,138,847,452,764,995,600,568,92,496,533,
//				404,186,345,304,420,181,73,547,281,374,376,454,438,553,929,140,
//				298,451,674,91,531,685,862,446,262,477,573,627,624,814,103,294,388};
		
//		int[] testData = {3, 4, 8, 5};
//		
//		for (int i = 0; i < testData.length; i++){
//			test.add(testData[i]);
//		}
//		
//		int result = DynamicProgram.backPack(10, test);
//		System.out.println("\n"+result);
		//DynamicProgramTest.triangleMatrix();
		
		/**
		 * test for reverse linked list
		 */
//		ListNode l1 = new ListNode(1);
//		ListNode l2 = new ListNode(2);
//		ListNode l3 = new ListNode(3);
//		ListNode l4 = new ListNode(4);
//		ListNode l5 = new ListNode(5);
//		
//		l1.next = l2;
//		l2.next = l3;
//		l3.next = l4;
//		l4.next = l5;
//		
//		ListNode ori = l1;
//		while (ori != null){
//			System.out.print(ori.val + " ");
//			ori = ori.next;
//		}
//		System.out.println();
//		ListNode tem = Reverse.reverseLinkedList(l1);
//		
//		
//		while (tem != null){
//			System.out.print(tem.val+" ");
//			tem = tem.next;
//		}
//		
		
		/**
		 * test for rotated string
		 */
//		String test = "abccba";
//		System.out.println(Rotate.rotateString(test, 4));
		
		/**
		 * test for rotated array search
		 */
//		int[] nums = {5,6,1,2,3,4};
//		int result = BinarySearch.binarySearchRotatedArray(nums, 1);
//		System.out.println(result);
		
		/**
		 * test for binary search
		 */
//		int[] nums = {1,2,4,4,5,6,7};
//		int target = 4;
//		
//		
//		System.out.println(BinarySearch.solution(nums, target));
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
