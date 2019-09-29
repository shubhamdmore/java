
public class lcm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int no1=50,no2=30;
		int i;
		int big=no1;
		for(i=big;i<1500;i++)
		{  
			if ((no1%i==0)&&(no2%i==0))
			{
				System.out.println("hi shubham");
				System.out.println(i);
			}
		}
		
	}

}
