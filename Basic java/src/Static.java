
public class Static {

	/**
	 * @param args
	 */
	static int a=1000;
	
    static
    {
    	System.out.println("this is static block");
    }
    Static()
    {
    	System.out.println("this is constructor");
    }
	static void display()
	{
		System.out.println("This is static method");
		display2();
		System.out.println("static method can access only static data member"+a);
	}
	void display1()
	{
		System.out.println("This is static method");
	}
	static void display2()
	{
		System.out.println("static method can call only static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("value of static variable is = "+a);
		Static.display();
		Static obj =new Static();
		
	}

}
