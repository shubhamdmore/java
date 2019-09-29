package com.dev.Inheritance;
class Xabc
{
	void display1()
	{
		System.out.println("tthis is parent class");
	}
}
class Child extends Xabc

{
	void display2()
	{
		System.out.println("tthis is child class");
	}
}
class Child1 extends Child

{
	void display3()
	{
		System.out.println("tthis is Sub child class");
	}
}

public class MultiLevel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child1 obj = new Child1();
      obj.display1();
      obj.display2();
      obj.display3();
		
	}

}
