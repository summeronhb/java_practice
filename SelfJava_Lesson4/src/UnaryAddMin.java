
public class UnaryAddMin {

	public static void main(String[] args) {
		
		short num1 = -5;
		System.out.println(+num1); 
		//"+"는 어떠한 변화도 주지 못한다. 그러나 사칙연산의 기본은 int형이므로 int로 형변환을 해버린다.
		System.out.println(-num1);
		
		short num2 = 7;
		short num3 = (short)(+num2); 
		//형 변환을 해주어야 컴파일 에러가 나지 않는다!
		short num4 = (short)(-num2);
		System.out.println(num3);
		System.out.println(num4);
		

	}

}
