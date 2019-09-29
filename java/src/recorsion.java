
public class recorsion {

	/**
	 * @param args
	 */
	int no;
	int result=0;
	int fact(int no)
	{
       this.no=no;
		if(no==1)
		{
		return 1;
		}
		else
		{
			result=no*fact(no-1);
		//	System.out.println("factorial of no :"+result);
			return result;
			
		}
		
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 recorsion obj=new  recorsion();
		 int x=obj.fact(5);
		 System.out.println("factorial of no :"+x);
		 
	}

}
