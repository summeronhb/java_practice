
public class BitOpMeans {

	public static void main(String[] args) {
		// 비트를 대상으로 하는 연산자들
		byte n1 = 13;	//00001101
		byte n2 = 7;	//00000111  
		// long의 경우에는 그렇지 않은데, byte나 short의 경우 계산될 떄 저절로 int로 변한다.
		byte n3 = (byte)(n1 & n2); //00000101 이르모 n3는 5
		System.out.println(n3);

	}

}
