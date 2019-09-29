
public class basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		if(i==10)
		{
			System.out.println("\n if statment is executed");
		}
		if(i==1)
		{
			System.out.println("\n if statment is executed");
		}
		else
		{
			System.out.println("else statment is executed");
			
		}
		//int x=0;
		for(int i1=0;i1<10;i1++)
		{
			if (i1==5)
				continue;
			System.out.println(i1);
		
		}
		int i5=5;
		while( i5<10)
		{
			System.out.println(i5);
			i5++;
		}

		do
		{
			System.out.println("do while loop is executed at least one");
		}while(false);
		
		
	}

}
