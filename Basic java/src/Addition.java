import java.util.*;
class add
{
	int a,b,c;
	void add1()
	{
		System.out.println("enter value of a and b");
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=a+b;
		System.out.println("Addition of a and b = "+c);
		
	}
}

public class Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       add obj=new add();
       obj.add1();
       
	}

}
