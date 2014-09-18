package com.test;

import com.javalearn.Apple;
import com.solution.MaxPointOnALine;
import com.structure.PointGenerator;

public class Test {
	
	public static void main(String args[]){
		System.out.println("test");
		
		PointGenerator pg = new PointGenerator(3);
		pg.getPoints();	
		
		pg.addPoints(4,1);
		pg.addPoints(4,2);
		pg.addPoints(4,3);
//		pg.addPoints(50,50);
//		pg.addPoints(40,40);
		//pg.printPoint();
		
		int result = MaxPointOnALine.maxPoint(pg.getPoints());
		
		System.out.println("Maximum # of points in same line "+result);
		
		
		
	}

}
