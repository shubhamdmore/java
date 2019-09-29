import java.util.*;
public class NestedIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner in=new Scanner(System.in);
		System.out.println("enter your age");
		age=in.nextInt();
        if(age>=18)
        {
        	if(age>=60)
        	{
        		System.out.println(" eligibal for voting and first Priority");
        	}
        	else
        	{
        		System.out.println(" eligibale for voting but second Priority");
        	}
        }
        else
        {
        	System.out.println("You are not eligibal  for voting");
        }
	}

}
