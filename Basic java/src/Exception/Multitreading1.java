package Exception;

public class Multitreading1 implements Runnable {

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multitreading1 obj = new Multitreading1();
		Thread t1 = new Thread();
		t1.start();
	}

}
