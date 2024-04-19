package Test;

public class CurrentAccount implements Accounts {

	@Override
	public void deposit() {
		System.out.println("Current Account Deposit");
	}

	@Override
	public void withDraw() {
		System.out.println("Current Account withdraw");
	}

	@Override
	public void interest() {
		System.out.println("Current Account interest");
	}

	@Override
	public void balance() {
		System.out.println("Current Account balance");
	}

}
