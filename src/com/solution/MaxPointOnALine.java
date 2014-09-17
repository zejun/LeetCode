package com.solution;

import java.util.ArrayList;
import java.util.Hashtable;

import com.structure.Point;

public class MaxPointOnALine {

	public static int maxPoint(ArrayList<Point> points){
		
		int maxPoint = 2;
		int lineNum = 0;
		Hashtable<String, Integer> table = new Hashtable();
		
		if(points.size()==0||points.size()==1){
			return 0;
		}else if(points.size()==2){
			return maxPoint;
		}else{
			//there should be more than 2 points in the same line
			//first loop for the points
			for(int i=0;i<points.size();i++){
				Point p1 = points.get(i);
				
				for(int j=i+1;j<points.size();j++){
					Point p2 = points.get(j);
					//for each line we have k 
					long k = (p1.gety()-p2.gety())/(p1.getx()-p2.getx());
					long a = p1.gety()-k*p1.gety();
					
					if(table.get(k+" "+a)!=null){
						System.out.println("Line already exist");
						
					}else{
						table.put(k+" "+a, 2);
						lineNum++;
						System.out.println("Line don't exist, add line "+lineNum);
					}
					
				}
				
			}
			
			return 2;
		}
		
		
	}
	
}
