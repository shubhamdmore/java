import java.util.*;

public class iteratorList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		  
		ArrayList al=new ArrayList();  
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(1,"Sachin");  
		  
		System.out.println("element at 2nd position: "+al.get(2));  
		  	
		ListIterator<String> itr=al.listIterator();  
		  
		System.out.println("traversing elements in forward direction...");  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		 }  
		 		System.out.println("traversing elements in backward direction...");  
		while(itr.hasPrevious())
		{  
		System.out.println(itr.previous());  
		 }  
		}  
		

	}


