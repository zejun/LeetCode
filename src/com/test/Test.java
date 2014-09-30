package com.test;

import com.javalearn.Apple;
import com.solution.MaxPointOnALine;
import com.solution.SortLinkedList;
import com.structure.ListNode;
import com.structure.Point;
import com.structure.PointGenerator;

public class Test {
	
	public static void main(String args[]){
		System.out.println("test");
		
//		Point pointa = new Point(3,1);
//		Point pointb = new Point(12,3);
//		Point pointc = new Point(3,1);
//		Point pointd = new Point(-6,-1);
//		Point[] input = {pointa,pointb,pointc,pointd};
//		
//		int result = MaxPointOnALine.maxPoint(input);
//		
//		System.out.println("The result is "+result);
//		
//		int test1 = 3;
//		
//		int v1 = test1/2;
//		int v2 = test1-v1;
		
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(1);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(8);
		a.next=b;
		b.next=c;
		c.next=d;
		
		ListNode e = SortLinkedList.sortList(a);
		
		while(e!=null){
			System.out.println(e.val);
			e=e.next;
		}
		
		//print linked list
		
		
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
