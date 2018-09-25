package com.hongfei.focus.interfaces.simpleexample.interfacemodify;

import com.hongfei.focus.interfaces.simpleexample.filter.BandPass;
import com.hongfei.focus.interfaces.simpleexample.filter.HighPass;
import com.hongfei.focus.interfaces.simpleexample.filter.LowPass;
import com.hongfei.focus.interfaces.simpleexample.filter.Waveform;
import com.hongfei.focus.interfaces.simpleexample.filter.adapter.FilterAdapter;
import com.hongfei.focus.interfaces.simpleexample.interfacemodify.stringprocessor.DownCase;
import com.hongfei.focus.interfaces.simpleexample.interfacemodify.stringprocessor.Splitter;
import com.hongfei.focus.interfaces.simpleexample.interfacemodify.stringprocessor.Upcase;
import com.sun.javafx.jmx.HighlightRegion;

public class Apply
{

	public static void process(Processor p, Object s)
	{

		System.out.println("Using Processor " + p.name());

		System.out.println(p.process(s));

	}

	private static String s = "Hello World";

	private static Waveform w = new Waveform();

	public static void main(String[] args)
	{

		process(new Upcase(), s);

		process(new DownCase(), s);

		process(new Splitter(), s);

		process(new FilterAdapter(new LowPass(1.0)), w);

		process(new FilterAdapter(new HighPass(2.0)), w);

		process(new FilterAdapter(new BandPass(3.0, 4.0)), w);

	}

}
