class BankAccount {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("ภÜพื: "+ balance);
		return balance;
	}
}


public class DupRef {

	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		ref1.deposit(100000);
		ref2.deposit(20000000);
		ref1.withdraw(10000);
		ref2.withdraw(5000);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
	}

}
