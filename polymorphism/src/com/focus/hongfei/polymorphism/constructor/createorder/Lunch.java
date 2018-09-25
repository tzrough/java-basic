package com.focus.hongfei.polymorphism.constructor.createorder;

class Lunch extends Meal
{

	private static int x = printInit("static Lunch.x initialized");

	private int y = printFiled("Lunch.y initialized");;

	Lunch()
	{

		System.out.println("Lunch Constructor");

	}

}
