
public class ContinueBasic {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {// 조건문 안에서는 증가하지 않은 num이고 조건문 탈출시 num은 1 증가한 값이 된다.
			if(((num % 5) != 0) || ((num %7) != 0)) 	
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+ count);

	}

}
