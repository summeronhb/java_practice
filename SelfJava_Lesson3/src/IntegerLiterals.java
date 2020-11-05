
public class IntegerLiterals {

	public static void main(String[] args) {
		// 오른편에 정수를 대입하면 기본은 integer형이다. 비록 long으로 선언하더라도 그렇다.
		
		int num1 = 123;
		int num2 = 0123; // 8진수 표현
		int num3 = 0x123; // 16진수 표현
		
		System.out.println("10진수 표현 : " + num1 );
		System.out.println("8진수 표현 : " + num2 );
		System.out.println("16진수 표현 : " + num3 );

		System.out.println("11 + 22 + 33 = " + (11+22+33));
		System.out.println("11 + 22 + 33 = " + (011+022+033));
		System.out.println("11 + 22 + 33 = " + (0x11+0x22+0x33));
		
		

		
		
		
	}
}
