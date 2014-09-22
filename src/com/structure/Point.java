package com.structure;

public class Point {
	
	public int x;
	public int y;
	
	public Point(){
		this.x=0;
		this.y=0;
	}
	
	public Point(int a, int b){
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
