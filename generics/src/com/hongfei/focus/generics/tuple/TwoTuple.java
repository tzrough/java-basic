package com.hongfei.focus.generics.tuple;

public class TwoTuple<A, B>
{

	private final A first;
	private final B second;

	public TwoTuple(A a, B b)
	{
		first = a;
		second = b;
	}

	public A getA() 
	{
		return first;
	}
	
	public B getB() 
	{
		return second;
	}
	
	@Override
	public String toString()
	{
		return "first:" + first + ", second:" + second;
	}

	public static void main(String[] args)
	{

		TwoTuple<String, Integer> tuple = new TwoTuple<String, Integer>("hello", 2);

		System.out.println(tuple.toString());
	}
}
