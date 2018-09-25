package com.hongfei.foucs.interfaces.simpleexample.processor;

import java.util.Arrays;

public class Splitter extends Processor
{

	public Object process(Object input)
	{

		return Arrays.toString(((String) input).split(" "));

	}

}
