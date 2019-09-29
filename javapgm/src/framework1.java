import java.util.ArrayList;
import java.util.Iterator;


public class framework1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj=new ArrayList();
		obj.add("10");
		obj.add("rohan");
		obj.add("mohini");
		
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
