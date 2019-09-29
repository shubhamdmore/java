
public class Pattern4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=3;i++)
		  {
			for(int j=i;j<3;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print(" * ");
					
			}
			System.out.println( );
		}
		for(int i=2;i>=1;i--)
		{
		
			for(int j=i;j<=2;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				
				
				System.out.print(" * ");
				
		}
		System.out.println( );

	}
	}

}
