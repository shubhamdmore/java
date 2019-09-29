import java.util.*;
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no ,i=1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter any number");
		no=in.nextInt();
		for(i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i*no);
		}
		

	}

}
