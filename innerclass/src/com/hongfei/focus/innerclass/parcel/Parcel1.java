package com.hongfei.focus.innerclass.parcel;

public class Parcel1
{

	class Destination
	{

		private String destination;

		Destination(String whereTo)
		{

			destination = whereTo;
		}

		String getDestination()
		{

			return destination;
		}
	}

	public void ship()
	{

		Destination destination = new Destination("Beijing");
		System.out.println(destination.getDestination());

	}

	public static void main(String[] args)
	{

		Parcel1 parcel = new Parcel1();

		parcel.ship();
	}
}
