package com.structure;

import java.util.ArrayList;
import java.util.Random;

import com.structure.Point;
import com.generator.*;

public class PointGenerator extends Generator{
	
	final int POINTNUM = 100;
	
	int pointsNum;
	ArrayList points;
	
	public PointGenerator(){
		this.pointsNum = POINTNUM;
		this.points = new ArrayList();
		
		
	}
	
	public PointGenerator(int num){
		this.pointsNum = num;
		this.points = new ArrayList();
		
		
	}
	
	public void addPoints(){
		Random rand = new Random();
		int x = rand.nextInt(100);
		int y = rand.nextInt(100);
		
		Point newPoint = new Point(x,y);
		points.add(newPoint);
	}
	
	public void addPoints(int x,int y){
		Point newPoint = new Point(x,y);
		points.add(newPoint);
	}
	
	public ArrayList getPoints(){
		return points;
	}

}
