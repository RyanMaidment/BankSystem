import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Bank {

	String bankName;
	int i;
	Account[] accounts;
	Scanner input = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private long phoneNum;
	private String email;
	public static void main(String[] args) {
		String menu;

		Bank bank = new Bank();

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter P to print account details.");
			System.out.println("Enter W to withdraw.");
			System.out.println("Enter D to deposit.");
			System.out.println("Enter Q to quit.");
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
				// TODO: Prompt index of account, prompt amount to deposit, call deposit method.
				break;

			case "q":
			case "Q":

			}
		} while (!menu.equals("q"));

	}

	public Bank() { // TODO:
		
		System.out.println("Enter Bank name: ");
		String bankName = input.nextLine();

		System.out.println("Enter number of accounts: "); // TODO: Verify the input is integer.
		int j = input.nextInt();
		this.accounts = new Account [j];
		
		for(i=1; i <= j; i++) {
			System.out.println("Enter First name: ");
			firstName = input.nextLine();
			
			System.out.println("Enter Last name: ");
			 lastName = input.nextLine();
			 
			System.out.println("Enter phone number: ");
			 phoneNum = input.nextLong();
			 
			System.out.println("Enter Email address: ");
			 email = input.nextLine();
		
		}
		
		Client client2 = new Client(firstName, lastName, phoneNum, email);
		System.out.println("Enter account balance: ");
		double balance = input.nextDouble();
		Account[] accounts = new Account[client2];
	}

	public void printAccounts() {
		DecimalFormat df = new DecimalFormat();
		for (i=1;i<=accounts.length;i++) {

			System.out.println(Arrays.deepToString(accounts));
		}
	}
}