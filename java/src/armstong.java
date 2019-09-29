
public class armstong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={153};
		
		for(int i=0;i<3;i++)
		{
			int n1=a[0]*a[0]*a[0];
			int n2=a[1]*a[1]*a[1];
			int n3=a[2]*a[2]*a[2];
			if(n1*n2*n3==153)
			{
				System.out.println("armstrong no");
			}
			else
			{
				System.out.println(" not armstrong no");
			}
		}
		
	}

}
