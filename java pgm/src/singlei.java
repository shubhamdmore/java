
class C
{
	void f1()
	{
		System.out.println("this is class A");
	}
	
}
class B extends C
{
	void f2()
	{
		System.out.println("this is class B");
	}
}

class D extends B
{
	void f3()
	{
		System.out.println("this is class C");
	}
}
public class singlei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D obj=new D();
		obj.f1();
		obj.f2();
		obj.f3();
	}

}
