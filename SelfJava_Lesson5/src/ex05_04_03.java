
public class ex05_04_03 {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		
		for(n = 1; n<=1000; n++) {
			if(n%2 == 0 && n%7 == 0) {
				sum += n;
			}
		}
		System.out.println("1000������ 2�� ������� 7�� ����� ���� " + sum + " �Դϴ�." );

	}

}
