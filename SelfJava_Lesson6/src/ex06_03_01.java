
public class ex06_03_01 {

	public static void main(String[] args) {
		
		System.out.println("3�� 2���� "+expo(3,2));
		System.out.println("3�� 3���� "+expo(3,3));
		System.out.println("6�� 4���� "+expo(6,4));

	}
	
	public static int expo(int a, int b) {
		if(b==1)
			return a;
		else
			return a*expo(a, b-1);
	}

}
