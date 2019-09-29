import java.util.*;
public class Switchcase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int sv ;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter your value");
		sv =sc.nextInt();
		switch(sv)
		{
		case 1:
			System.out.println("today is monday");
			break;
		case 2:
			System.out.println("today is tuesaday");
			break;
		case 3:
			System.out.println("today is wensday");
			break;
		case 4:
			System.out.println("today is thersday");
			break;
		case 5:
			System.out.println("today is friday");
			break;
		case 6:
			System.out.println("today is saterday");
			break;
		case 7:
			System.out.println("today is sunday");
			break;
		default :
			System.out.println("enter value between 1 to 7");
			
		}
		
	}

}
