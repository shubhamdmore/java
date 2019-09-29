
public class Thiskeyword {

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
		System.out.println("roll no:"+roll);
		System.out.println("name   :"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thiskeyword obj=new Thiskeyword();
		obj.setdata(21,"shubham");
		obj.display();
	}

}
