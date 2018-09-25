package com.hongfei.focus.interfaces.simpleexample.interfacemodify.stringprocessor;

import java.util.Arrays;

public class Splitter extends StringProcessor
{

	public Object process(Object input)
	{

		return Arrays.toString(((String) input).split(" "));
	}

}
