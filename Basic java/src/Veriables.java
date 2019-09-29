
public class Veriables {

	/**
	 * @param args
	 */
	private int y=20;
	static int z=30;
	void mymethod()
	{
	    final int x=10;
		System.out.println("local variables = "+x);
		System.out.println("instance variables = "+y);
		System.out.println("class variables = "+z);
	}
	 Veriables()
	{
		System.out.println("this is default constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veriables obj = new Veriables();
		obj.mymethod();
		
	}

}
