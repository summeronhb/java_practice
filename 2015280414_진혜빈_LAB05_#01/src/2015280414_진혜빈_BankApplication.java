import java.util.Scanner;
public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3. ���� | 4. ��� | 5.����");
			System.out.println("---------------------------------");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	//���� �����ϱ�
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("���»���");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ: ");
		String account = scanner.nextLine();
		System.out.println(account);
		System.out.print("������: ");
		String name = scanner.nextLine();
		System.out.println(name);
		System.out.print("�ʱ� �Աݾ�: ");
		int dep = scanner.nextInt();
		System.out.println(dep);
		System.out.println("���°� �����Ǿ����ϴ�.");
	}
	
	//���� ��Ϻ���
	private static void accountList() {
		
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("����");
		System.out.println("--------------");
		System.out.print("���¹�ȣ: ");
		String account = scanner.nextLine();
		System.out.println(account);
		System.out.print("���ݾ�: ");
		int depos = scanner.nextInt();
		System.out.println(depos);
		System.out.println("������ �����Ǿ����ϴ�.");
		
	}
	//����ϱ�
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		System.out.println("���¹�ȣ: ");
		String account = scanner.nextLine();
		System.out.println(account);
		System.out.print("��ݾ�: ");
		int withd = scanner.nextInt();
		System.out.println(withd);
		System.out.println("����� �����Ǿ����ϴ�.");
		
	}
	//Account �迭���� ano�� ������  Account ��ü ã��
	private static Account findAccount(String ano) {
		
	}
}
