package com.dev.Inheritance;
interface A
{
	void display();
}
interface B 
{
	void display();
}
public class Multiple implements A,B{

	/**
	 * @param args
	 */
	public void display()
	{
		System.out.println("hiiiiiiiiii");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple obj = new Multiple();
		obj.display();
	}

}
