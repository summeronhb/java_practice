
public class BitOpMeans {

	public static void main(String[] args) {
		// ��Ʈ�� ������� �ϴ� �����ڵ�
		byte n1 = 13;	//00001101
		byte n2 = 7;	//00000111  
		// long�� ��쿡�� �׷��� ������, byte�� short�� ��� ���� �� ������ int�� ���Ѵ�.
		byte n3 = (byte)(n1 & n2); //00000101 �̸��� n3�� 5
		System.out.println(n3);

	}

}
