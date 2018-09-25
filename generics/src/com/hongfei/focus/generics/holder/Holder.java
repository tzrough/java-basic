package com.hongfei.focus.generics.holder;

public class Holder<A>
{

	private A a;

	public Holder(A a)
	{
		this.a = a;
	}

	public A getA()
	{
		return a;
	}

	public void setA(A a)
	{
		this.a = a;
	}

	public static void main(String[] args)
	{

		Holder<String> holder = new Holder<String>("hello world");

		System.out.println(holder.getA());
	}

}
