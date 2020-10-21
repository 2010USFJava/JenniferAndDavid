package com.revature.beans;

public class Drink {
	private String name;
	private int calories;
	private int sugars;
	
	public Drink(String name, int calories, int sugars) {
		this.name= name;
		this.calories=calories;
		this.sugars=sugars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getSugars() {
		return sugars;
	}

	public void setSugars(int sugars) {
		this.sugars = sugars;
	}

	@Override
	public String toString() {
		return "drink [name=" + name + ", calories=" + calories + ", sugars=" + sugars + "]";
	}
	
	
}
