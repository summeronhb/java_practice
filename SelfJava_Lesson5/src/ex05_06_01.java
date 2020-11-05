
public class ex05_06_01 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i<100; i++) {
			if(((i % 5) != 0) || ((i % 7) != 0))
				continue;
			count++;
			System.out.println(i);
		}
		System.out.println("count: "+ count);
	}

}
