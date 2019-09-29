
public class MultiTreading extends Thread {

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiTreading obj=new MultiTreading();
		obj.start();
		
	}
	

}
