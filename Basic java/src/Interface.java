interface myinterface
{
	void rateOfIntrest();
   
}
class Boi implements  myinterface
{
	public void  rateOfIntrest()
	{
		System.out.println("Rate Of Intrest Of Boi is = 10");
	}
}
class Vijya implements  myinterface
{
	public void  rateOfIntrest()
	{
		System.out.println("Rate Of Intrest Of Bom is = 7");
	}
}
class Xyp implements  myinterface
{
	public void  rateOfIntrest()
	{
		System.out.println("Rate Of Intrest Of Rbi is = 10");
	}
}

public class Interface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Boi obj = new Boi();
      obj.rateOfIntrest();
      Vijya ob1 = new Vijya();
      ob1.rateOfIntrest();
      Xyp obj1 = new Xyp();
      obj1.rateOfIntrest();
	}

}
