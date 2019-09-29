
public class armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r ,no=153,i,temp,sum=0;
		temp=no;
		while(no>0)
		{
		 r=no%10;
		 sum=sum+(r*r*r);
		 no=no/10;
		}
		
        if(sum==temp)
        	System.out.println("this is armstrong number");
        else
        	System.out.println("this is not a armstrong number");
	}

}
