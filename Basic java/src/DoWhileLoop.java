import java.util.*;
public class DoWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no ,i=1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter any number");
		no=in.nextInt();
		do
		{
			System.out.println(i*no);
			i++;
		}while(i<=10);
	}

}
