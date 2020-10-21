package com.revature.state;

public class Drink {
	
	private String color;
	private String flavor;
	private int size;
	
	public Drink() {
	}

	public Drink(String color,String flavor,int size) {
		this.color=color;
		this.flavor=flavor;
		this.size=size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Drink [color=" + color + ", flavor=" + flavor + ", size=" + size + "]";
	}
	
	
	
	

}
