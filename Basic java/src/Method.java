import java.util.*;
public class Method {

	/**
	 * @param args
	 */
	 static void display()
		{
			System.out.println("this is static method");
		}
	 int add(int x ,int y)
	 {
		 int z=x+y;
//		 System.out.println("addition ="+Z);
	     return z ;		 
	 }
	 void age(int y)
	 {
		 if(y>18)
		 {
			 System.out.println("You are eligible for voting");
		 }
		 else
		 {
			 System.out.println("You are  not eligible for voting");
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Method obj = new Method();
		display();
		int k = obj.add(10, 20);
		System.out.println(k);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int d = sc.nextInt();
		obj.age(d);
		
		
	}

}
