import java.util.*;
public class input {

	/**
	 * @param args
	 */
	Scanner sc=new Scanner(System.in);
	int a,b;
	void add()
		
	{
		System.out.println("enter values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
	    int	c=a+b;
		System.out.println("ADDITION IS ="+c);
		
	}
	
	void name()
	{
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      input obj=new input();
      obj.name();
      obj.add();
	}

}
