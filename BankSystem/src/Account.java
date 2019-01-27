import java.util.Random;

public class Account {

	private long accountNum;
	private double balance;
	Client client1 = new Client(null, null, accountNum, null);

	public Account(Client client1, double balance) {
	

	}

	public void deposit(double amt, double balance) {
		
		amt += balance; 
		
	}

	public boolean withdraw(double amt) {
		if (amt <= balance) {
			return true;
		}

		else {
			return false;
		}

	}

	public long getAccountNum() {
		return accountNum;

	}

	public Client getClient() {
		return null;

	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		client1.getName();
		return getName();

	}
}
