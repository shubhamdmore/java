
public class fact {

	/**
	 * @param args
	 */
	int no;
	void setno(int n)
       	{

	no=n;	
	
	for (int i=1; i<=no;i++)
	   {
		public int   result=0;
	    result=no*i;
	   }
	System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fact obj=new fact();
		obj.setno(5);
		//obj.fun();
	}

}
