
public class CompAsssignOp {

	public static void main(String[] args) {
		
		short num = 10; // ���ʿ� num�� short�� �ʱ�ȭ �Ǿ���.
		num = (short)(num + 77L); //���� �� ��ȯ�� ������ ������ ������ ������ �߻��Ѵ�.
		
		int rate = 3;
		rate = (int)(rate * 3.5);
		
		System.out.println(num);
		System.out.println(rate);
		
		
		num = 10;
		num += 77L; // �׷��� ���հ��迬���ڸ� ����� ��� �ڵ����� ����ȯ�� �����ش�. ������ ������ �Ȼ����.
		
		rate = 3;
		rate *=3.5;
		
		System.out.println(num);
		System.out.println(rate);
		
		

	}

}
