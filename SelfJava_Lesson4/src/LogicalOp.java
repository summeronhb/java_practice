
public class LogicalOp {
	public static void main(String[] args) {
		// 논리연산자도 boolean값을 결과값으로 출력한다.
		
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = (1 < num1) && (num1 < 100);
		System.out.println("1 초과 100 미만인가? " + result);
		
		// 사칙연산이 등호보다 우선순위가 높으므로 굳이 괄호 안해줘도 되긴 함. (확인)
		result = (((num2 % 2) == 0 ) || ((num2 % 3) == 0));
		System.out.println("2 또는 3의 배수인가? " + result);
		
		result = !(num1 != 0);
		System.out.println("num1은 0인가? " + result);
		
		
	}

}
