interface A2
{
	int x=11;
	void f1();
	
}
interface B2 extends A2
{
	int y=22;
	void f1();
}
class ABC implements  B2
{
	public void f1() {
		System.out.println("this is father class ");
		//System.out.println(x);
	}
	
	
	public void f3() {
		System.out.println("this is child class");
		
	}
}
public class interfaceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ABC obj=new ABC();
       obj.f1();
      // obj.f2();
       obj.f3();
	}

}
