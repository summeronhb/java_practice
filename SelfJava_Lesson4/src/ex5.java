
public class ex5 {

	public static void main(String[] args) {
		int n1 = ((25+5) + (36/4) - 72) *5;
		int n2 = ((25*5) + (36-4) + 71)/4;
		int n3 = (128 / 4) *2 ;
		
		boolean result;
		result = ((n1>n2) && (n2>n3));
		
		System.out.println("n1은" + n1 +"입니다.");
		System.out.println("n2는" + n2 +"입니다.");
		System.out.println("n3는" + n3 +"입니다.");
		System.out.print("n1>n2>n3 는 ");
		System.out.print(result);
		System.out.println(" 입니다.");
	} 

}
