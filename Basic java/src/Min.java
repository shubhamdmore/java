
public class Min {

	/**
	 * @param args
	 * @return 
	 */
	static int min(int arr[])
	{
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		  
		System.out.println(min);  
		return 1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]={20,50,60,30,40,10};
    int m = min(a);
    System.out.println("min value = "+m);
	}

}
