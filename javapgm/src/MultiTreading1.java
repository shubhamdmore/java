
public class MultiTreading1  implements Runnable{

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("thraed is excecuted");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiTreading1 obj=new MultiTreading1 ();
		Thread obj1=new Thread(obj);
		obj1.start();
	}

}
