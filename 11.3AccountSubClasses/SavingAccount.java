public class SavingAccount extends Account {
	private double balance;

	public SavingAccount() {
	}

	public double withdraw(double amount) {
		super.withdraw(amount);
		return super.getBalance();
	}

}
