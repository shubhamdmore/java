
public class Swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =100,b=200,c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int x=1000,y=2000;
		x=x+y;//3000
		y=x-y;//1000
		x=x-y;//2000
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
