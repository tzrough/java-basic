package com.hongfei.focus.interfaces.simpleexample.interfacemodify.stringprocessor;

import com.hongfei.focus.interfaces.simpleexample.interfacemodify.Processor;

public abstract class StringProcessor implements Processor
{

	public String name()
	{

		return getClass().getSimpleName();
	}

	public abstract Object process(Object input);

}
