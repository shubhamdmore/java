
public class fibonacy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1,n3,no=5,i;
		System.out.println(n1);
		System.out.println(n2);
		for(i=2;i<=no;i++)
		{
			
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}
