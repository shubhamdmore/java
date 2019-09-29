
interface  abc
{
	void f1();
	
}
class mnp implements abc
{
	void f2()
	{
     System.out.println("this is class xyz");
     
    }
	
	public 	void f1()
		{
	     System.out.println("this is class A");
	    }
	
}
class pqr extends mnp
{
	
		void f3()
		{
	     System.out.println("this is class child method");
	    }
	
}
public class MultipleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pqr obj=new pqr();
		obj.f1();
		obj.f2();
		obj.f3();
	}

}
