import java.util.*;
public class mthread1 extends Thread{

	/**
	 * @param args
	 */
	 public void run()
	{
		System.out.println("Thread is running");
	}
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mthread1 obj=new mthread1();
		obj.start();

	}
	

}
