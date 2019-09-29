class P
{
	String name="shubham";
	P()
	{
		System.out.println("this is super class");
	}
}
class S extends P
{
	String name="rohan";
	void f1()
	{
	System.out.println(super.name);

	}
	S()
	{
		
		System.out.println("this is sub class");
	}
}

public class superkey {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        S obj=new S();
       obj.f1();
		
	}

}
