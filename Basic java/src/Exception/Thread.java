package Exception;

public class Thread extends java.lang.Thread{

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("this is thread running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obj = new Thread();
		obj.start();
	}

}
