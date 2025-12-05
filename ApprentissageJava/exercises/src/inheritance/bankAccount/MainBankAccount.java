package inheritance.bankAccount;

public class MainBankAccount {
	public static void main(String[] args) {
		BankAccount victorAccount = new SavingsAccount("Victor", 981.45);
		victorAccount.deposit(700.25);
		victorAccount.withdraw(1000);
		victorAccount.withdraw(800);
	}
}
