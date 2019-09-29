class xyz extends Thread
{
	public void run()
	{
		int j=1;
		for(j=1;j<6;j++)
			System.out.println("THREAD 2="+j);
		System.out.println(""+Thread.currentThread().getPriority());
	}
}
public class ThreadTest extends Thread {

	/**
	 * @param args
	 */
	public void run()
	{
		int i=1;
		for(i=1;i<6;i++)
			System.out.println("THREAD 1="+i);
		System.out.println(""+Thread.currentThread().getPriority());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		xyz a=new xyz();
		ThreadTest obj=new ThreadTest();
		obj.start();
		a.start();
		//obj.start();
		obj.setPriority(1);
		a.setPriority(1);
	}

}
