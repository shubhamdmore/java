
public class fact {

	/**
	 * @param args
	 */
	int no;
	void factorial(int n)
	{
		no=n;
		int r=0;
		int result=0;
		int result1=0;
		if(no==0||no==1)
		{
			System.out.println("factoreai="+"1");
		}
		else
			
		{	
			for(int i=1;i<=no;i++)
			
		{
			result=no*i;
			result1=result*i;
			
		}
		}
		System.out.println("factorial of number="+result1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact obj=new fact();
		obj.factorial(0);
		}

}
