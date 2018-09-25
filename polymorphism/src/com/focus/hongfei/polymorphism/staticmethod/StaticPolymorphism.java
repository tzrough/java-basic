package com.focus.hongfei.polymorphism.staticmethod;

public class StaticPolymorphism
{

	public static void main(String[] args)
	{

		StaticSuper sup = new StaticSub(); // Upcast

		// 如果某个方法是静态的，它的行为就不具有多态性
		System.out.println(sup.staticGet());

		System.out.println(sup.dynamicGet());
	}

}
