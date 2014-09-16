package com.test;

import com.solution.MaxPointOnALine;
import com.structure.PointGenerator;

public class Test {
	
	public static void main(String args[]){
		System.out.println("test");
		
		PointGenerator pg = new PointGenerator(2);
		pg.getPoints();
		
		
		int result = MaxPointOnALine.maxPoint(pg.getPoints());
		pg.printPoint();
		System.out.println(result);
		
	}

}
