package com.focus.hongfei.polymorphism.constructor.innermethod;

class Glyph
{

	void draw()
	{

		System.out.println("Glyph.draw()");
	}

	Glyph()
	{

		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");

	}

}
