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
					float k = ((float)p1.gety()-(float)p2.gety())/((float)p1.getx()-(float)p2.getx());
					float a = (float)p1.gety()-(float)k*p1.gety();
					
					
					
					if(table.get(k+" "+a)!=null){
						//System.out.println("Line already exist");
						
					}else{
						table.put(k+" "+a, 2);
						lineNum++;
						Integer num = 2;
						
						System.out.println("Initial line "+p1.getx()+" "+p1.gety()+"  "+p2.getx()+" "+p2.gety());
//						
						for(int x=j+1;x<points.size();x++){
							Point px = points.get(x);
							
							if((a+k*px.getx())==px.gety()){
								num++;
								System.out.println("Find same line "+px.getx()+" "+px.gety());
								
								if(num>maxPoint){
									maxPoint = num;
								}
							}
							
						}
						
						System.out.println("Line don't exist, add line "+lineNum);
					}
					
				}
				
			}
			
			return maxPoint;
		}
		
		
	}
	
}
