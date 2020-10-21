package com.revature.state;

public class Food {

	private String color;
	private int calories;
	private String type;
	
	public Food() {
	}

	public Food(String color,int calories,String type) {
		this.color=color;
		this.calories=calories;
		this.type=type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Food [color=" + color + ", calories=" + calories + ", type=" + type + "]";
	}
	
	
	


}
