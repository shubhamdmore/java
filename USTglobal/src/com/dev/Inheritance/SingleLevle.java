package com.dev.Inheritance;

 class Parent
{
	 void display()
	{
		System.out.println("this is parent method");
	}
}

public class SingleLevle extends Parent{

	/**
	 * @param args
	 */
	void display()
	{
		System.out.println("this is child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLevle obj = new SingleLevle();
		obj.display();
		Parent obj1 = new Parent();
		obj1.display();
	}

}
