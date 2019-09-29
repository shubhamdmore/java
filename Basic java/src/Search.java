import  java.util.*;
public class Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {20,10,30,50,40,60,90,70,80};
       Scanner in = new Scanner(System.in);
       System.out.println("enter key for search");
       int key = in.nextInt();
       int c=0;
       for(int i=0;i<a.length;i++)
       {
    	   if(key==a[i])
    	   {
    		   c++;
    	   }
       }
       if(c>0)
       {
    	   System.out.println("key is found");
       }
       else
       {
    	   System.out.println("key is not found");
       }
	}

}
