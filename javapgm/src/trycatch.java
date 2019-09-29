import java.util.Scanner;


public class trycatch {

	/**
	 * @param args
	 */
	void test()
	{
		System.out.println("enter values of a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
		int c=a/b;
		System.out.println(c);
	    }
		catch(ArithmeticException e)
		{
			System.out.println("number divid 0 is not possible ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       trycatch obj=new trycatch();
       obj.test();
	}

}
