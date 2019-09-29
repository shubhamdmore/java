  class B
{
	void A()
	{
	System.out.println("this is super class ");	
	}
}
public class test extends B {

	/**
	 * @param args
	 */
	void A()
	{
		super.A();
		System.out.println("this is sub class" );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   test obj=new test();  
   obj.A();
	
	}

}
