
public class ex06_02_01 {

	public static void main(String[] args) {
		System.out.println("원 넓이는 "+ area(1.8));
		System.out.println("원 둘레는 "+ circum(1.4));
	}
	
	public static double area(double rad) {
		return rad*rad*3.14;
	}
	

	public static double circum(double rad) {
		 final double PI = 3.14;
	     return rad * 2 * PI;
	}
}
