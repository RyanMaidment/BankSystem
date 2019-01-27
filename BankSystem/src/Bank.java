import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {

	String bankName;
	int i;
	double accounts[] = new double[i];
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Bank bank = new Bank();
		
		int menu = 0;
		switch(menu) {
		
		case 'a': System.out.println("Hello");
		case 'c': System.out.println("Wassup");
		}
	
		}

	public Bank() {
		
		System.out.println("Enter Bank name: ");
		String bankName = input.nextLine();
		
		System.out.println("Enter number of accounts: ");
		double accounts = input.nextDouble();
			}

	public void printAccounts() {
		DecimalFormat df = new DecimalFormat();
		for (i = 0; i >= accounts.length; i++) {

			System.out.println(accounts);
		}
	}
}