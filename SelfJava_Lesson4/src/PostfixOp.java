
public class PostfixOp {

	public static void main(String[] args) {
		int num = 5;
		
		System.out.print((num++) + " "); 
		// num�� ���� ������ �� �� �����ȴ�. 5 ��� �� num�� 6�� ����ȴ�.
		System.out.print((num++) + " ");
		// 6�� ��µ� �� num�� 7�� ����ȴ�.
		System.out.print("\n");
		
		// num���� 7�� ����ȴ�.
		System.out.print((num--) + " ");
		System.out.print((num--) + " ");
		
	}

}
