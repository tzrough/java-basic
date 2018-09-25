package com.hongfei.foucs.interfaces.simpleexample.processor;

public class Apply
{

	public static String s = "Hello World";

	public static void process(Processor p, Object s)
	{

		System.out.println("Using Processor " + p.name());

		System.out.println(p.process(s));
	}

	public static void main(String[] args)
	{

		process(new Upcase(), s);

		process(new Downcase(), s);

		process(new Splitter(), s);

	}

}
