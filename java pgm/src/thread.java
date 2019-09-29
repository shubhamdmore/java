
public class thread implements Runnable{

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      thread obj=new thread();
      Thread t1=new Thread(obj);
      t1.start();
	}

}
