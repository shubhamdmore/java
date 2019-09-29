package Exception;
import java.util.*;
public class Bank {

	/**
	 * @param args
	 */
	public static int bal = 10000 , withdrow,add;
	static void diplay()
	{ 
		System.out.println("enter 1 for withdrow");
		System.out.println("enter 2 for deposite");
		System.out.println("enter 3 for check balance");

		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter your choice");
			System.out.println("******************************");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("please enter your withdrow amount");
				withdrow = sc.nextInt();
				if(withdrow<=bal)
				{
					bal = bal - withdrow;
					System.out.println("your available balance is = "+bal);
				}
				else
				{
					System.out.println("enter amount below your balance");
				}
				
				break;
			case 2:
				System.out.println("Please enter your deposite amount");
				add = sc.nextInt();
				bal = bal + add;
				System.out.println("your available balance is ="+bal);
				break;
			case 3:
				System.out.println("your available balance is ="+bal);
				break;
			default :
				System.out.println("please enter valid choice");
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank.diplay();
	}

}
