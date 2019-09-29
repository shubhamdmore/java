import java.util.Iterator;
import java.util.LinkedList;


public class Linkedlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj=new LinkedList();
		obj.add("shubham");
		obj.add("rohan");
		obj.add("mohini");
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
