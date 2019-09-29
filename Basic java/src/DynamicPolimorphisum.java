class base
{
	void display()
	{
		System.out.println("this is parent class method");
	}
}
class xyz extends base
{
	void display()
	{
		System.out.println("this is child class method");
	}
}
public class DynamicPolimorphisum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       xyz obj = new xyz();
       obj.display();
       base obj1 = new base();
       obj1
       .display();
		
	}

}
