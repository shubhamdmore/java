
public class thisTest {

	/**
	 * @param args
	 */
	int roll;
	String name;
	void setdata(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	
	}
	void display()
	{
		System.out.println(roll);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisTest obj=new thisTest();
		obj.setdata(21,"Aishwarya");
		obj.display();
	}

}
