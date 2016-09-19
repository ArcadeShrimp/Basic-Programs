public class CheckingAccount extends Account {
	private double balance;
	private double limit;

	public CheckingAccount() {
		this(100.0);
	}

	public CheckingAccount(double limit) {
		this.limit = limit;
	}

	public double withdraw(double amount) {
		balance = super.getBalance();

		balance -= amount;
		if (balance < -limit) {
			balance += amount;
			System.out.println("Sorry dude, you can't ");
			return balance;
		} else {
			super.withdraw(amount);
			return super.getBalance();
		}
	}
}
