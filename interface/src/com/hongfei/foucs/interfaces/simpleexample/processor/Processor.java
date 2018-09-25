package com.hongfei.foucs.interfaces.simpleexample.processor;

/** 用继承方法实现 **/

public class Processor
{

	public String name()
	{

		return getClass().getSimpleName();
	}

	public Object process(Object input)
	{

		return input;
	}

}
