package com.focus.hongfei.polymorphism.field;

public class Sub extends Super
{

	public int field = 1;

	// 若注释掉此方法，创建子类对象后，调用getField方法
	// 将会调用父类getField方法，获取父类的filed值
	@Override
	public int getField()
	{

		return field;
	}

	public int getSuperField()
	{

		return super.field;
	}

}
