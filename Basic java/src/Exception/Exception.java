package Exception;
import java.util.*;

public class Exception {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("opration succsessfull"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finallay block always exicuted exception may occure or not");
		}
	}

}
