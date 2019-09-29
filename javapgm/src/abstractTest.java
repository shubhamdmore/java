 abstract class bank
 {
	 abstract void  intrest();
 }
  public class abstractTest extends bank {

	/**
	 * @param args
	 */
	void intrest()
	{
		System.out.println("10 %interest ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     abstractTest o=new abstractTest();   
     o.intrest();
	}

}
