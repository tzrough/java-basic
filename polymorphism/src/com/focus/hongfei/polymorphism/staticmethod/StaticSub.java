package com.focus.hongfei.polymorphism.staticmethod;

class StaticSub extends StaticSuper
{

	public static String staticGet()
	{

		return "Derived staticGet()";
	}

	public String dynamicGet()
	{

		return "Derived dynamicGet()";
	}

}
