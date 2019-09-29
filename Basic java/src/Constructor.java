
public class Constructor {

	/**
	 * @param args
	 */
	int x;
	String myname;
	int myage;
	public  Constructor(String name,int age)
	{
		x=10;
		myname=name;
		myage=age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj =new Constructor("shubham",19);
		System.out.println(obj.x);
		System.out.println("my name is "+obj.myname+" and my age is "+obj.myage);
	}

}
