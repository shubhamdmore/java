
public class multiThreding extends Thread{

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiThreding obj=new multiThreding();
		obj.start();
		//obj.stop();
		
	}

}
