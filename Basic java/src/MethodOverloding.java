
public class MethodOverloding {

	/**
	 * @param args
	 */
	final void add(int a , int b)
	{
		int c = a+b;
		System.out.println("addition of a and b is = " +c);
	}
	void  add(float x , int y )
	{
		float d = x+y;
		System.out.println("addition of a and b is and c = " +d);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloding obj = new MethodOverloding();
		obj.add(5, 9);
		obj.add(25, 15);
	}

}
