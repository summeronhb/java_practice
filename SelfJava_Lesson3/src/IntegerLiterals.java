
public class IntegerLiterals {

	public static void main(String[] args) {
		// ������ ������ �����ϸ� �⺻�� integer���̴�. ��� long���� �����ϴ��� �׷���.
		
		int num1 = 123;
		int num2 = 0123; // 8���� ǥ��
		int num3 = 0x123; // 16���� ǥ��
		
		System.out.println("10���� ǥ�� : " + num1 );
		System.out.println("8���� ǥ�� : " + num2 );
		System.out.println("16���� ǥ�� : " + num3 );

		System.out.println("11 + 22 + 33 = " + (11+22+33));
		System.out.println("11 + 22 + 33 = " + (011+022+033));
		System.out.println("11 + 22 + 33 = " + (0x11+0x22+0x33));
		
		

		
		
		
	}
}
