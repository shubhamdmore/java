
public abstract class AbstactTest {

	/**
	 * @param args
	 */
	public  abstract void  method();
	class test extends AbstactTest
	{
	public 	void method()
		{
			System.out.println("this is abstarct pgm");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		test obj= new test();
		
		obj.method();
	}

}
