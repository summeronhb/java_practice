
public class BitShiftOp {

	public static void main(String[] args) {
		byte num;
		
		num = 2; //00000010
		System.out.print((num<<1) + " "); // 00000100 = 4
		System.out.print((num<<2) + " "); // 00001000 = 8
		System.out.print((num<<3) + " "); // 00010000 = 16
		System.out.println("\n");
		// <<1 �� ������ �ڸ����� 2�̹Ƿ� *2��ŭ �����Ѵ�.
		
		num = 8; //00001000
		System.out.print((num>>1) + " "); 
		System.out.print((num>>2) + " "); 
		System.out.print((num>>3) + " ");
		System.out.println("\n");
		// >>1 �� ������ �ڸ����� 2�̹Ƿ� /2��ŭ �����Ѵ�.
		
		num = -8; // 11111000
		System.out.print((num>>1) + " "); //11111100 00000100 = -4
		System.out.print((num>>2) + " "); //11111110 00000010 = -2
		System.out.print((num>>3) + " "); //11111111 = -1
		System.out.println("\n");
		
		
		
		
		

	}

}
