import java.util.*;


public class bank {

	/**
	 * @param args
	 */
	double bal=0;
	void diposit()
	{
	 System.out.println("enter your amount");
	 Scanner sc=new Scanner(System.in);
     double amount=sc.nextDouble();
     bal=bal+amount;
     System.out.println("YOUR TOTAL BAL IS :"+bal);
	}
	void withdrow()
	{
	 System.out.println("enter your amount");
	 Scanner sc=new Scanner(System.in);
     double amount=sc.nextDouble();
     try{
     if(amount<=bal)
     {
    	 bal=bal-amount;
    	 System.out.println("YOUR TOTAL BAL IS :"+bal);
    	 System.out.println("TRANSACTION SUCSSESFULLY");
     }
     }
     catch(Exception e)
     {
    	 System.out.println("YOUR BAL IS LOW");
     }
    		 

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bank obj=new bank();
		obj.diposit();
		obj.withdrow();
	}

}
