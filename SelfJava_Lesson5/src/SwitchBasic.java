
public class SwitchBasic {

	public static void main(String[] args) {
		int n = 3;
		
		// switch 반복문은 break가 없으면 뒤에도 실행된다.
		
		switch(n) {
		case 1:
			System.out.println("Simple Java");
		case 2:
			System.out.println("Funny Java");
		case 3:
			System.out.println("Fantastic Java");
		dafault:
			System.out.println("The best programming language");
		}
		
		System.out.println("Do you like Java?");
	}

}
