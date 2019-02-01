import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Bank {

	private String bankName;
	private Account[] accounts;	
	private Scanner input = new Scanner(System.in);

	public Bank() { // TODO:
		
		System.out.println("Enter Bank name: ");
		this.bankName = input.nextLine();

		System.out.println("Enter number of accounts: "); // TODO: Verify the input is integer.
		int j = input.nextInt();
		accounts = new Account[j];

	
		for (int i = 1; i <= j; i++) {
			System.out.println("Enter First name: ");
			firstName = input.next();

			System.out.println("Enter Last name: ");
			lastName = input.next();

			System.out.println("Enter phone number: ");
			phoneNum = input.nextLong();

			System.out.println("Enter Email address: ");
			email = input.next();

		}

		Client client = new Client(firstName, lastName, phoneNum, email);
		System.out.println("Enter account balance: ");
		client.account() = input.nextDouble();
		Account[] accounts = new Account[j];
	}

	public void printAccounts() {
		DecimalFormat df = new DecimalFormat();
		for (int i = 1; i <= accounts.length; i++) {

			System.out.println(Arrays.deepToString(accounts));
		}
	}

	public static void main(String[] args) {
		String menu;
		Bank bank = new Bank();

		do {
			System.out.println("Enter P to print account details.");
			System.out.println("Enter W to withdraw.");
			System.out.println("Enter D to deposit.");
			System.out.println("Enter Q to quit.");

			Scanner input = null;
			menu = input.nextLine();

			switch (menu) {

			case "p":
			case "P":
				bank.printAccounts();
				break;

			case "w":
			case "W":

				// TODO: Prompt index of account, prompt amt to withdraw, call withdraw method,
				// if statement for insifficient funds.
				break;

			case "d":
			case "D":
				System.out.println("How much would you like to deposit? ");
				double balance = input.nextDouble();
				// TODO: Prompt index of account, prompt amount to deposit, call deposit method.

				break;

			case "q":
			case "Q":

			}
		} while (!menu.equals("q"));

	}

}