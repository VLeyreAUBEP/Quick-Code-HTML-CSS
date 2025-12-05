package constructor.account;

public class Account {
	private String accountNumber;
	private double balance;
	
	public Account(final String accountNumber, final double balance) {
		if(!accountNumber.isEmpty() && accountNumber != "" && balance >= 0) {
			this.accountNumber = accountNumber;
			this.balance = balance;
		} else {
			System.err.println("L'instanciation ne respecte pas les conditions.");
		}
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
	public static void main(String[] args) {
		//Account accountFail = new Account("B43C567", -403.06);
		Account accountSucceed = new Account("A23423", 4326.25);
		System.out.println("La deuxième instance est valable car le numéro de compte " + accountSucceed.getAccountNumber() + " ainsi que le solde " + accountSucceed.getBalance() + " respecte les règles d'instanciation du constructeur.");
	}
}
