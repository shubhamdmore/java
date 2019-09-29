class 
public class synchronizedTest extends Thread {

	/**
	 * @param args
	 */
	 synchronized public void run()
	{
		System.out.println("A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		synchronizedTest obj=new synchronizedTest();
		obj.start();
	}

}
