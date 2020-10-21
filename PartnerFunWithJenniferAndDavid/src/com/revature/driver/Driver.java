package com.revature.driver;

import com.revature.beans.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drink redBull = new Drink ("Red Bull", 112, 27);
		Food turkeySandwich = new Food("Turkey Sandwich", 300, 7);
		System.out.println(redBull + " "  + turkeySandwich);
	}

}
