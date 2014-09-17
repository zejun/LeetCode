package com.javalearn;

public class Apple extends Fruit{

	private String taste;
	
	public Apple(){
		
	}
	
	public Apple(String tasteInput){
		this.setTaste(tasteInput);
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
}
