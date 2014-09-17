package com.test;

import com.javalearn.Apple;
import com.solution.MaxPointOnALine;
import com.structure.PointGenerator;

public class Test {
	
	public static void main(String args[]){
		System.out.println("test");
		
		PointGenerator pg = new PointGenerator(3);
		pg.getPoints();	
		
		pg.addPoints(1,1);
		pg.addPoints(2,2);
		pg.addPoints(3,3);
		pg.printPoint();
		
		int result = MaxPointOnALine.maxPoint(pg.getPoints());
		
		System.out.println(result);
		
		
		
	}

}
