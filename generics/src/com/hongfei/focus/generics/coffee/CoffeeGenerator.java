package com.hongfei.focus.generics.coffee;

import java.util.Iterator;
import java.util.Random;

import com.hongfei.focus.generics.util.Generator;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>
{

	private Class[] types = { Latte.class, Mocha.class, Cappuccino.class };
	private static Random rand = new Random(66);
	private int size = 0;

	public CoffeeGenerator()
	{
	}

	// for iteration
	public CoffeeGenerator(int size)
	{
		this.size = size;
	}

	@Override
	public Coffee next()
	{
		try
		{
			return (Coffee) types[rand.nextInt(types.length)].newInstance();

		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public Iterator<Coffee> iterator()
	{

		return new CoffeeIterator();
	}

	class CoffeeIterator implements Iterator<Coffee>
	{

		int count = size;

		@Override
		public boolean hasNext()
		{

			return count > 0;
		}

		@Override
		public Coffee next()
		{
			count--;
			return CoffeeGenerator.this.next();
		}

		// Not implemented
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
	};

	public static void main(String[] args)
	{

		CoffeeGenerator gen1 = new CoffeeGenerator();
		//
		// for (int i = 0; i < 10; i++) {
		//
		// System.out.println(gen1.next());
		// }

		CoffeeGenerator gen2 = new CoffeeGenerator(10);

		for (Coffee coffee : gen2)
		{

			System.out.println(gen2.iterator().hasNext());
			System.out.println(coffee);
		}

	}

}
