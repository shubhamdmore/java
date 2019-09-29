
public class TypeCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("widening type casting");
		int a=100;
		double d = a;//automatically
        System.out.println("int a ="+a);
        System.out.println("double d="+d);
        System.out.println("narrowing type casting");
        double dd = 120.12;
        int aa = (int)dd;
        System.out.println("double dd = "+dd);
        System.out.println("int aa ="+aa);
	}

}
