package com.focus.hongfei.polymorphism.constructor.createorder;

public class Sandwich extends PortableLunch
{

	private Bread bread = new Bread();

	private Cheese cheese = new Cheese();

	private Lettuce lettuce = new Lettuce();

	public Sandwich()
	{

		System.out.println("Sandwich Constructor");
	}

	public static void main(String[] args)
	{

		new Sandwich();

	}

}
