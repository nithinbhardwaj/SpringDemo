package org.kaushik.javabrains;

public class Traiangle implements Shape {
	
	public void myInit(){
		System.out.println("Initializing the bean");
	}
public void destroy(){
	System.out.println("destroy");
}
	private String type;
	
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public void draw(){
		System.out.println("Triangle is drawn "+getType());
		
	}
}
