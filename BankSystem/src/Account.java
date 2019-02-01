import java.util.Random;

public class Account {

	private long accountNum;
	private double balance;
	private Client client = new Client(null, null, accountNum, null);
			Random random = new Random();

	public Account(Client client, double balance) {
		this.balance = 0;
		this.client = client ;
	}

	public void deposit(double amt, double balance) {

		amt += this.balance;

	}

	public boolean withdraw(double amt) {
		if (amt <= this.balance) {
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
		return this.client;

	}

	public double getBalance() {
		return this.balance;
	}

	public String getName() {
		return client.getName();

	}
}
