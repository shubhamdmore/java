import java.util.*;
public class WhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no ,i=1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter any number");
		no=in.nextInt();
		while(i<=10)
		{   if(i==5)
		    {
			break;
    		}
			System.out.println(i*no);
			i++;
		}
		System.out.println("Break stetement execute correct");
	}

}
