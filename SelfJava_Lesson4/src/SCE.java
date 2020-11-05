
public class SCE {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 +=10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');
		// num2 = 10 이 아닌 이유는 && 연산자의 경우 앞 부분이 false면 뒷 부분이 실행되지 않으므로
		
		result = (( num1 += 10 ) > 10 ) || (( num2 += 10 ) > 10);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		// num2 가 0인 이유는 || 연산자의 경우 앞 부분이 true면 뒷 부분이 실행되지 않으므로
		
		// 그러므로 num2를 boolean값에 관계없이 연산을 반영하고 싶으면, 코드를 나눠서 작성해주는 것이 좋다.
		
	}


}
