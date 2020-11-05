
public class ArithOp {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 =" + (num1 + num2));
		System.out.println("num1 - num2 =" + (num1 - num2));
		System.out.println("num1 * num2 =" + (num1 * num2));
		System.out.println("num1 / num2 =" + (num1 / num2));
		System.out.println("num1 / num2 =" + (num1 / (float)num2));
		// 하나만 강제 형변환 해주어도 실수로 결과값이 도출된다.
		System.out.println("num1 % num2 =" + (num1 % num2));
		
	}

}
