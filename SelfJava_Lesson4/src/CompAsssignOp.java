
public class CompAsssignOp {

	public static void main(String[] args) {
		
		short num = 10; // 애초에 num이 short로 초기화 되었다.
		num = (short)(num + 77L); //강제 형 변환을 해주지 않으면 컴파일 에러가 발생한다.
		
		int rate = 3;
		rate = (int)(rate * 3.5);
		
		System.out.println(num);
		System.out.println(rate);
		
		
		num = 10;
		num += 77L; // 그러나 복합관계연산자를 사용할 경우 자동으로 형변환을 시켜준다. 컴파일 에러가 안생긴다.
		
		rate = 3;
		rate *=3.5;
		
		System.out.println(num);
		System.out.println(rate);
		
		

	}

}
