
public class TreadPriority extends Thread {

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("THREAD NAME ="+Thread.currentThread().getName());
		System.out.println("THREAD PRIORITY="+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreadPriority obj1=new TreadPriority();
		
		TreadPriority obj2=new TreadPriority();
		
		TreadPriority obj3=new TreadPriority();
		
		obj1.setPriority(MIN_PRIORITY);
		
		obj2.setPriority(NORM_PRIORITY);
		
		obj3.setPriority(MAX_PRIORITY);
	
	   obj1.start();
	   obj2.start();
	   obj3.start();
	}

}
