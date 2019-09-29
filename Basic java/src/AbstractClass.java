abstract class ClassA
{
	void mymethod()
	{
		System.out.println("This is non abstract method");
	}
	 public ClassA()
	{
		System.out.println("abstarct class also have constructor");
	}
	abstract void rateOfIntrest();
	
}
class Sbi extends ClassA
{
	void rateOfIntrest()
	{
		System.out.println("SBI rate of Intrest Is = 10");
	}
}
class Bom extends ClassA
{
	void rateOfIntrest()
	{
		System.out.println("Bom rate of Intrest Is = 7");
	}
}
class Rbi extends ClassA
{
	void rateOfIntrest()
	{
		System.out.println("Rbi rate of Intrest Is = 5");
	}
}
class Icici extends ClassA
{
	void rateOfIntrest()
	{
		System.out.println("ICICI rate of Intrest Is = 1");
	}
}
public class AbstractClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sbi obj =new Sbi();
        obj.rateOfIntrest();
        Bom obj1 =new Bom();
        obj1.rateOfIntrest();
        Rbi obj3 = new Rbi();
        obj3.rateOfIntrest();
        Icici obj2 = new Icici();
        obj2.rateOfIntrest();
      //  ClassA obj = new ClassA(); ==>we cant create object of abstract class
        
	}

}
