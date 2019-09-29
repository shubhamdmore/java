import java.util.*;
public class PrimeNumber {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);
	void mymethod()
	{
		System.out.println("enter any number");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
			
		}
		if(c>=1)
		{
			System.out.println("this is not prime number");
		}
		else
		{
			System.out.println("this is  prime number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj= new PrimeNumber();
		obj.mymethod();
      
	}
	
}
