package Exception;

public class Multitreading extends Thread {

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("thread 1 is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multitreading obj = new Multitreading();
		obj.start();
	}

}
