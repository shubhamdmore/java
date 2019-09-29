
public class Mthread implements Runnable {

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mthread obj=new Mthread();
		Thread t1=new Thread(obj);
		t1.start();
		
	}

}
