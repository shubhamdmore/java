
public class StaticPolymorphisum {

	/**
	 * @param args
	 */
	int  add1(int a , int b)
	{
		int c = a+b;
		System.out.println("addition = "+c);
		return 1;
	}
	 float  add1(float x , int y , int k)
	{
		float z = x+y+k;
		System.out.println("addition = "+z);
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPolymorphisum obj = new StaticPolymorphisum();
		obj.add1(5,9);
		obj.add1(11, 9, 5);
		
	}

}
