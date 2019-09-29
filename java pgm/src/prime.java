
public class prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=411,i,flag=0;
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag++;
			}
		}
		if(flag>0)
			System.out.println("this is not a prime number");
		else
			System.out.println("this is a prime number");
	}

}
