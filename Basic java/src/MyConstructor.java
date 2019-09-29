
public class MyConstructor {

	/**
	 * @param args
	 */
	MyConstructor()
	{
		System.out.println("constructor is called autometically");
		display();
	}
	MyConstructor(int x)
	{
		System.out.println("This is parameterized constructor");
		
	}
	MyConstructor(double x)
	{
		System.out.println("This is parameterized 1constructor");
		
	}
	MyConstructor(double d,int x)
	{
		System.out.println("This is parameterized constructor double and int");
		
	}
	
	MyConstructor(int x,double d)
	{
		System.out.println("This is parameterized constructor int and double");
		
	}
	void display()
	{
		System.out.println("constructor can call other method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConstructor obj = new MyConstructor(2.0,5);
	}

}
