
public class PostfixOp {

	public static void main(String[] args) {
		int num = 5;
		
		System.out.print((num++) + " "); 
		// num이 먼저 적용이 된 후 증가된다. 5 출력 후 num에 6이 저장된다.
		System.out.print((num++) + " ");
		// 6이 출력된 후 num에 7이 저장된다.
		System.out.print("\n");
		
		// num에는 7이 저장된다.
		System.out.print((num--) + " ");
		System.out.print((num--) + " ");
		
	}

}
