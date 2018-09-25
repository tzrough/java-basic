package com.focus.hongfei.polymorphism.constructor.createorder;

class Meal
{

	private static int x = printInit("static Meal.x initialized");

	private int y = printFiled("Meal.y initialized");

	private int z = 9;

	Meal()
	{

		System.out.println("Meal Constructor");
	}

	int printFiled(String s)
	{

		System.out.println(s);

		System.out.println("z = " + z);

		return 6;
	}

	static int printInit(String s)
	{

		System.out.println(s);

		return 69;

	}

}
