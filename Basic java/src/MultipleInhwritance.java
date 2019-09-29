interface A
{
	void display();

}
interface B
{
	void display();
}
class C implements A,B
{
	public void display()
	{
		System.out.println("interface A");
	}


}
public class MultipleInhwritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.display();
	}

}
