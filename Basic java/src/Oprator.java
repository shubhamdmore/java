
public class Oprator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println("Arithmetic oprator");
	   int a=10 , b=20;
	   System.out.println("addirion ="+(a+b));
	   System.out.println("substarction ="+(b-a));
	   System.out.println("multilication ="+(a*b));
	   System.out.println("division ="+(b/a));
	   
	   System.out.println("reletional oprator");
	   if(a>b)
	   {
		   System.out.println("a is big");
	   }
	   else
	   {
		   System.out.println("a is small");
	   }
	   System.out.println("logical oprator");
	   
	   int c=30;
	   
	   if((a>b)&&(a>c))
	   {
		   System.out.println("a is big");
	   }
	   else if((b>a)&&(b>c))
	   {
		   System.out.println("b is big b");
	   }
	   else
	   {
		   System.out.println("c is big");
	   }
	   
	   String name="shubham";
	   
	   System.out.println(name.length());
	}

}
