package com.hongfei.foucs.interfaces.simpleexample.processor;

public class Upcase extends Processor
{

	public String process(Object input)
	{

		return ((String) input).toUpperCase();
	}

}
