
public class Constructor {

	/**
	 * @param args
	 */
	int x,y,x1,y1;
	Constructor(double d,double e)
	
	{
		x=(int) d;
		y=(int) e;
		System.out.println(x+"  "+y);
		System.out.println("this is default constuctor");
	}
   Constructor(float x2,float y2)
	
	{
		x1=(int) x2;
		y1=(int) y2;
		int c=x+y;
		System.out.println("addition of x and y="+c);
		System.out.println("this is default constuctor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj=new Constructor(41,25);
		Constructor obj1=new Constructor(12.52,25.65);
	}

}
