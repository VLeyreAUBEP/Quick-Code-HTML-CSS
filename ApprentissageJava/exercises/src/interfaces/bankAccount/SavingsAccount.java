package interfaces.bankAccount;

public class SavingsAccount implements BankAccount{
	private String name;
	private double accountBalance;
	
	public SavingsAccount(final String name, final double accountBalance) {
		this.name = name;
		this.accountBalance = accountBalance;
	}
	
	public void deposit(final double depot) {
		accountBalance += depot;
		System.out.println("A deposit of " + depot + "CHF has been made.");
		displayAccountBalance();
	}
	
	public void withdraw(final double withdraw) {
		if(accountBalance - withdraw < 100) {
			System.out.println("Cannot withdraw the ammount of " + withdraw + "CHF as the balance account would fall to " + (accountBalance - withdraw));
			displayAccountBalance();
		}else {
			accountBalance -= withdraw;
			System.out.println("A withdraw of " + withdraw + "CHF has been made.");
			displayAccountBalance();
		}
	}
	public void displayAccountBalance() {
		System.out.println(name + "'s balance account is at " + accountBalance);
	}

}
