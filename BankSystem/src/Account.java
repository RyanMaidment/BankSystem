import java.util.Random;

public class Account {

	private long accountNum;
	private double balance;
	private Client client = new Client(null, null, accountNum, null);
	private Random random = new Random();

	public Account(Client client, double balance) {
		balance = 0;
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
		return random.nextLong();

	}

	public Client getClient() {
		return client;

	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return client.getName();

	}
}
