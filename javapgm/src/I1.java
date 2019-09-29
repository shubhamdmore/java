
public interface I1 {

	void add();
	void mult();
	
}
class X implements I1
{
	public void add()
	{
		//int c=a+b;
		System.out.println("Addtion is =");
	}
	 public void mult()
	{
		//int d=x*y;
		System.out.println("Addtion is =");
	}
}
class eg
{
	public static void main(String args[])
	{
		X obj=new X();
		obj.add();
		obj.mult();
	}
	
}