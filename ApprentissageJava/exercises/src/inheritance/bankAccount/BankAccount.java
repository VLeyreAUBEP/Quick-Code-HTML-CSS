package inheritance.bankAccount;

public class BankAccount {
	protected String name;
	protected double accountBalance;
	
	public BankAccount(final String name, final double accountBalance) {
		this.name = name;
		this.accountBalance = accountBalance;
		displayAccountBalance();
	}
	
	public void deposit(final double depot) {
		accountBalance += depot;
		System.out.println("A deposit of " + depot + "CHF has been made.");
		displayAccountBalance();
	}
	
	public void withdraw(final double withdraw) {
		accountBalance -= withdraw;
		System.out.println("A withdraw of " + withdraw + "CHF has been made.");
		displayAccountBalance();
	}
	
	public void displayAccountBalance() {
		System.out.println(name + "'s balance account is at " + accountBalance);
	}
}
