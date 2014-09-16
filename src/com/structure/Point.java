package com.structure;

public class Point {
	
	int x;
	int y;
	
	Point(){
		x=0;
		y=0;
	}
	
	Point(int a, int b){
		this.x=a;
		this.y=b;
	}
	
	public int getx(){
		return this.x;
	}
	
	public int gety(){
		return this.y;
	}

}
