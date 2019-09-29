class Myclass8
{
	public int g =25;
	protected int p=36;
    int k=90;
	void method()
	{
		System.out.println("private vareables = "+k);
		System.out.println("protected vareables = "+p);
	}
}
class child extends Myclass8
{
	void mychild()
	{
		System.out.println("protected variables = "+p);
	}
}
public class AccessSpesifire {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass8 obj = new Myclass8();
		obj.method();
		
		child obj2 = new child();
		obj2.mychild();
		
	}

}
