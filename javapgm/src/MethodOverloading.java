
public class MethodOverloading {

	/**
	 * @param args
	 */
	//int a=10,b=100;
	float x=10045.45f, y=451.5f;
    int min(int a,int b)
    {
    	int min;
		if (a>b)
    	 min=b;
    	else 
    	min=a;
    	return(min);
    }
    double min(double x,double y)
    {
    	double min;
		if (x>y)
    	 min=y;
    	else 
    	min=x;
    	return(min);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();

	//	obj.min(15,18);
		System.out.println(obj.min(18,25));
		
		System.out.println(obj.min(145.45,5245.41));

		
	}

}
