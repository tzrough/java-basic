package com.hongfei.focus.generics.tuple;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B>
{

	public final C third;

	public ThreeTuple(A a, B b, C c)
	{
		super(a, b);
		third = c;
	}

	@Override
	public String toString()
	{
		return super.toString() + ", third:" + third;
	}

	public static void main(String[] args)
	{

		ThreeTuple<String, Integer, Long> tuple = new ThreeTuple<String, Integer, Long>("HELLO", 2, 3L);

		System.out.println(tuple.toString());
	}

}
