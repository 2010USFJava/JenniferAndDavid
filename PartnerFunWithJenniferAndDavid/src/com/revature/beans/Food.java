package com.revature.beans;

public class Food {
	private String name;
	private int calories;
	private int fat;
	
	public Food(String name, int calories, int fat) {
		this.name=name;
		this.calories=calories;
		this.fat=fat;
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

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	@Override
	public String toString() {
		return name + ": calories=" + calories + "cal, fat=" + fat + "g";
	}
	
	
}
