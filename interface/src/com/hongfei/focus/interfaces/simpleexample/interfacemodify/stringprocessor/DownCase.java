package com.hongfei.focus.interfaces.simpleexample.interfacemodify.stringprocessor;

public class DownCase extends StringProcessor
{

	public Object process(Object input)
	{

		return ((String) input).toLowerCase();

	}

}
