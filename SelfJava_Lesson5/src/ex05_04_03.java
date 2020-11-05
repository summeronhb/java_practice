
public class ex05_04_03 {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		
		for(n = 1; n<=1000; n++) {
			if(n%2 == 0 && n%7 == 0) {
				sum += n;
			}
		}
		System.out.println("1000이하의 2의 배수이자 7의 배수의 합은 " + sum + " 입니다." );

	}

}
