import java.util.*;
public class exceptionhandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
		int num,din;
		float r;
		
		System.out.println("enter numareator");
		num=sc.nextInt();
		System.out.println("enter  denominator");
		din=sc.nextInt();
		try{
		r=num/din;
		System.out.println("result ="+r);
		}
		
		finally
		{
			System.out.println("finally block is exicuted");
		}
	}

}
