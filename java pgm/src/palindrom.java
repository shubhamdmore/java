
public class palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=121512,i,r,sum=0,temp;
		temp=no;
		while(no>0)
		{
			r=no%10;
			sum=(sum*10)+r;
			no=no/10;
		}
		System.out.println(temp);
		System.out.println(sum);
		if(sum==temp)
			System.out.println("this is palindrom number");
		else
			System.out.println("this is not a palindrom number");

	}

}
