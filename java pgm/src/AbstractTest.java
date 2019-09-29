 abstract  class A1
{
     int a=10;
	 void f1()
	{
		System.out.println("this is nonabstact method");
		System.out.println(++a);
	}
	 abstract  void f2();
 
}
class B1 extends A1
{
	void f2()
	{
		System.out.println("this is abstact method");
	}	

}
public class AbstractTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B1 obj =new B1();
        obj.f1();
        obj.f2();
	}

}
