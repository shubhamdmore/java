
public class fibfun {

	/**
	 * @param args
	 */
	int n1=0,n2=1;
	int n3=0;
//	int num=10;
	void  fib(int n1,int n2)
	
	{
		int num=10;
		this.n1=n1;
		this.n2=n2;
		n3=n1+n2;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<num;i++)
		{
		n1=n2;
		n2=n3;
		fib(n1,n2);
		}
	}
			public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
