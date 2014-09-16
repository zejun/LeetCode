package com.structure;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

import com.structure.Point;
import com.generator.*;

public class PointGenerator{
	
	final int POINTNUM = 100;
	

	
	Hashtable<String, Boolean> table = new Hashtable();
	
	int pointsNum;
	ArrayList<Point> points;
	

	
	public PointGenerator(){
		this.pointsNum = POINTNUM;
		this.points = new ArrayList<Point>();
		
		int i=0;
		while(i<this.pointsNum){
			this.addPoints();
			i++;
		}
		
	}
	
	
	public PointGenerator(int num){
		this.pointsNum = num;
		this.points = new ArrayList<Point>();
		
		int i=0;
		while(i<this.pointsNum){
			this.addPoints();
			i++;
		}
	}
	
	
	public void printPoint(){
		for(int i=0;i<points.size();i++){
			System.out.println("x="+points.get(i).getx()+" y="+points.get(i).gety());
		}
	}
	
	public void addPoints(){
		Random rand = new Random();
		int x = rand.nextInt(100);
		int y = rand.nextInt(100);
		
		Point newPoint = new Point(x,y);
		String key = x+" "+y;
		if(table.get(key)==null){
			table.put(key, new Boolean(true));
			points.add(newPoint);
		}else{
			int x1 = rand.nextInt(100);
			int y1 = rand.nextInt(100);
			addPoints(x1,y1);
		}
		
		
	}
	
	public void addPoints(int x,int y){
		Point newPoint = new Point(x,y);
		
		String key = x+" "+y;
		if(table.get(key)==null){
			table.put(key, new Boolean(true));
			points.add(newPoint);
		}else{
//			System.out.println("Not able to add point");
		}
	}
	
	public ArrayList<Point> getPoints(){
		
		return points;
	}
	
	

}
