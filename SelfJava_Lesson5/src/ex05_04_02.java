
public class ex05_04_02 {

	public static void main(String[] args) {
		int num = 1;
		
		while(num<=100) {
			System.out.print(num + " ");
			num++;
			
		}
		System.out.println("/n");
		--num;
		
		do {
			System.out.print(num + " ");
			num--;
		}while(num>0);

	}

}
