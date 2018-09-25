package com.hongfei.focus.loadorder;

class Insect
{

	private int i = 9;

	protected int j;

	private static int x = printInit("static Insect.x initialized");

	Insect()
	{

		System.out.println("i = " + i + ", j = " + j);

		j = 66;

	}

	static int printInit(String s)
	{

		System.out.println(s);

		return 69;

	}

}
