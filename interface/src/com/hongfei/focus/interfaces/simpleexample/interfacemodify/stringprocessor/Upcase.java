package com.hongfei.focus.interfaces.simpleexample.interfacemodify.stringprocessor;

public class Upcase extends StringProcessor
{

	public Object process(Object input)
	{

		return ((String) input).toUpperCase();
	}

}
