
public class ex06_1_1 {
	
	public static void main(String[] args) {
		System.out.println("2015�� 2804�� ");
		System.out.println("���ϱ� ��� " + plus(2015,2804));
		System.out.println("���� ��� " + minus(2015,2804));
		System.out.println("���ϱ��� " + multi(2015,2804));
		System.out.println("������ ��� " + divide(2015,2804));
	
	
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
			System.out.println("0���δ� ���� �� �����ϴ�.");
			return 0;
		}
		return (double)num1/num2;
			
	}
	
}
