package com.hongfei.focus.innerclass.parcel;

public class Parcel2
{

	class Contents
	{

		private int price = 10;

		public int getPrice()
		{
			System.out.println("price is " + price);
			return price;
		}
	}

	class Destination
	{

		private String destination;

		Destination(String whereTo)
		{

			destination = whereTo;
		}

		String getDestination()
		{
			System.out.println("destination is " + destination);
			return destination;
		}
	}

	public Destination to(String whereTo)
	{

		return new Destination(whereTo);
	}

	public Contents contents()
	{

		return new Contents();
	}

	public static void main(String[] args)
	{

		Parcel2 parcel = new Parcel2();

		// OuterClassName.InnerClassNames
		Parcel2.Contents contents = parcel.contents();
		Parcel2.Destination destination = parcel.to("Beijing");

		contents.getPrice();
		destination.getDestination();

	}

}
