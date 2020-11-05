
public class ex06_1_1 {
	
	public static void main(String[] args) {
		System.out.println("2015와 2804의 ");
		System.out.println("더하기 결과 " + plus(2015,2804));
		System.out.println("빼기 결과 " + minus(2015,2804));
		System.out.println("곱하기결과 " + multi(2015,2804));
		System.out.println("나누기 결과 " + divide(2015,2804));
	
	
}

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multi(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double divide(int num1, int num2) {
		if (num2 == 0)
		{
			System.out.println("0으로는 나눌 수 없습니다.");
			return 0;
		}
		return (double)num1/num2;
			
	}
	
}
