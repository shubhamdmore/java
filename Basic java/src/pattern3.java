
public class pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 char c = 65;
			for(int i=1;i<=3;i++)
			{
				for(int j=i;j<3;j++)
				{
					System.out.print("  ");
				}
				for(int k=1;k<=(i*2)-1;k++)
				{
					
					System.out.print(c);
					System.out.print(" ");
					c++;	
				}
				System.out.println( );
			}
			int m=1;
			for(int i=2;i>=1;i--)
			{
			
				for(int j=i;j<=2;j++)
				{
					System.out.print("  ");
				}
				for(int k=1;k<=(i*2)-1;k++)
				{
					
					System.out.print(m);
					System.out.print(" ");
					m++;
				
				}
				System.out.println( );
			}

	}

}
