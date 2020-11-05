
public class BitShiftOp {

	public static void main(String[] args) {
		byte num;
		
		num = 2; //00000010
		System.out.print((num<<1) + " "); // 00000100 = 4
		System.out.print((num<<2) + " "); // 00001000 = 8
		System.out.print((num<<3) + " "); // 00010000 = 16
		System.out.println("\n");
		// <<1 할 떄마다 자리수가 2이므로 *2만큼 증가한다.
		
		num = 8; //00001000
		System.out.print((num>>1) + " "); 
		System.out.print((num>>2) + " "); 
		System.out.print((num>>3) + " ");
		System.out.println("\n");
		// >>1 할 떄마다 자리수가 2이므로 /2만큼 감소한다.
		
		num = -8; // 11111000
		System.out.print((num>>1) + " "); //11111100 00000100 = -4
		System.out.print((num>>2) + " "); //11111110 00000010 = -2
		System.out.print((num>>3) + " "); //11111111 = -1
		System.out.println("\n");
		
		
		
		
		

	}

}
