
public class SCE {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 +=10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');
		// num2 = 10 �� �ƴ� ������ && �������� ��� �� �κ��� false�� �� �κ��� ������� �����Ƿ�
		
		result = (( num1 += 10 ) > 10 ) || (( num2 += 10 ) > 10);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		// num2 �� 0�� ������ || �������� ��� �� �κ��� true�� �� �κ��� ������� �����Ƿ�
		
		// �׷��Ƿ� num2�� boolean���� ������� ������ �ݿ��ϰ� ������, �ڵ带 ������ �ۼ����ִ� ���� ����.
		
	}


}
