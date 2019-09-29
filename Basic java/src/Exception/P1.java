package Exception;

public class P1 extends Thread {

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             P1 obj =new P1();
             obj.start();
	}

}
