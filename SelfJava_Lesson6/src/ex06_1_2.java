
public class ex06_1_2 {

	public static void main(String[] args) {
		
		absolute(-8, -7);
		absolute(7, 3);
		absolute(4,-3);
		
	}

	public static void absolute(int n1, int n2) {
		if(n1-n2>0)
			System.out.println(n1-n2);
		else
			System.out.println(-(n1-n2));
	}
}
