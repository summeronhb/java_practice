
public class ContinueBasic {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {// ���ǹ� �ȿ����� �������� ���� num�̰� ���ǹ� Ż��� num�� 1 ������ ���� �ȴ�.
			if(((num % 5) != 0) || ((num %7) != 0)) 	
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+ count);

	}

}
