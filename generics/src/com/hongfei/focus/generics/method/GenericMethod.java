package com.hongfei.focus.generics.method;

public class GenericMethod
{

	public <A> void a(A a)
	{
		System.out.println(a.getClass().getName());
	}

	public static void main(String[] args)
	{

		GenericMethod genericMethod = new GenericMethod();

		genericMethod.a("hello world");
		genericMethod.a(1);
	}
}
