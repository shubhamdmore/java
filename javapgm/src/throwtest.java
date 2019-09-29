
public class throwtest {

	/**
	 * @param args
	 */
	int age;
	void check(int age)
	{
		this.age=age;
		if(age>18)
		{
			System.out.println("CONGRATULATION YOU ARE ELIGIBLE FOR VOTING");
		}
		else
		{
	      throw new ArithmeticException("not you valid");  
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		throwtest obj=new throwtest();
		obj.check(2);
		
	}

}
