import java.util.*;
public class Exception {

	/**
	 * @param args
	 */
	Scanner sc=new Scanner(System.in);
	void division()
	{
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("enter value of b");
		int b = sc.nextInt();
		try
		{
			int c = a/b;
			System.out.println("result = "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block always exicutrd");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception obj =new Exception();
		obj.division();

	}

}
