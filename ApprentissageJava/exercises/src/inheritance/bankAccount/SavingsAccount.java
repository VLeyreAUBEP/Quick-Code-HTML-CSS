package inheritance.bankAccount;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(final String name, final double accountBalance) {
		super(name, accountBalance);
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
}
