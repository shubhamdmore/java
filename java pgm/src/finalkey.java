
 class XY
{
	  final  void f1()
	{
		System.out.println("this is f1 function");
	}
	    int f1(int a)
		{
			System.out.println("this is  function");
		}
}
class G extends XY
{
	 void f2()
	{
		System.out.println("this is f1 function");
	}
}
public class finalkey {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         G obj=new G();
         obj.f1(4);
		 
	}

}
