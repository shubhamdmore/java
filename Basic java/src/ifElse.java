import java.util.*;
public class ifElse {

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
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println(" Not eligible for voting");
		}

	}

}
