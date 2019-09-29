
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={8,2,3,4,5,6,7,9};
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if (min>array[i])
				min=array[i];
		}
         System.out.println("minimum nubmer of array="+min);		

     	int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if (max<array[i])
				max=array[i];
		}
         System.out.println("maximum nubmer of array="+max);		

	}
	

}
