package Test;

public class SavingsAccount implements Accounts {

	@Override
	public void deposit() {
		System.out.println("Savings Account Deposit");
	}

	@Override
	public void withDraw() {
		System.out.println("Savings Account withdraw");

	}

	@Override
	public void interest() {
		System.out.println("Savings Account interest");
	}

	@Override
	public void balance() {
		System.out.println("Savings Account balance");
	}

}
