
public class Student {

	/**
	 * @param args
	 */
	int roll;
	String name;
	char div;
	void setroll(int r)
	{
		roll=r;
	}
	void setname(String n)
	{
		name=n;
	}
	void setdiv(char c)
	{
		div=c;
	}
	void show()
	{
		System.out.println("student name :"+name);
		System.out.println("student roll :"+roll);
		System.out.println("student  div :"+div);
		System.out.println("thank you");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student obj=new Student();
       obj.setdiv('A');
       obj.setname("shubham");
       obj.setroll(21);
       obj.show();
	}

}
