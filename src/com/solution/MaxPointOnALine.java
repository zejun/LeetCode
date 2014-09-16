package com.solution;

import java.util.ArrayList;

import com.structure.Point;

public class MaxPointOnALine {

	public static int maxPoint(ArrayList<Point> points){
		
		if(points.size()==0||points.size()==1){
			return 0;
		}else if(points.size()==2){
			return 2;
		}else{
			//there should be more than 2 points in the same line
			
			
			return 2;
		}
		
		
	}
	
}
