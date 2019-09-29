import java.util.*;
public class special {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter your informatio");
    Scanner sc=new Scanner(System.in);
    ArrayList al=new ArrayList();
    
    for(;;)
   { 
	   System.out.println("enter your name");
	  // String name=sc.nextLine();
//	   System.out.println(al.add());
     	al.add("shubham"); 
   }
    Iterator it=al.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
		
	}

}
