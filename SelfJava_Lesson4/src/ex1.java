
public class ex1 {
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20, num3 = 30;
		num1 = num2 = num3;
		// "="은 결합방향이 <- 이므로 num3부터 대입된다.
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
