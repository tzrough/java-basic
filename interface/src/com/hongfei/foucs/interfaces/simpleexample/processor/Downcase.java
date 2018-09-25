package com.hongfei.foucs.interfaces.simpleexample.processor;

public class Downcase extends Processor
{

	public String process(Object input)
	{

		return ((String) input).toLowerCase();
	}

}
