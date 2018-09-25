package com.hongfei.focus.interfaces.simpleexample.filter.adapter;

import com.hongfei.focus.interfaces.simpleexample.filter.Filter;
import com.hongfei.focus.interfaces.simpleexample.filter.Waveform;
import com.hongfei.focus.interfaces.simpleexample.interfacemodify.Processor;

public class FilterAdapter implements Processor
{

	Filter filter;

	public FilterAdapter(Filter filter)
	{

		this.filter = filter;
	}

	public String name()
	{

		return filter.name();
	}

	public Waveform process(Object input)
	{

		return filter.process((Waveform) input);

	}

}
