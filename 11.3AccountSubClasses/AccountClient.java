import java.util.Scanner;
import java.util.ArrayList;

public class AccountClient {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Account> list = new ArrayList<Account>();
		selection(list);
	}

	public static void makeAccount(ArrayList<Account> list) {

		System.out
				.println("Which kind of account do you want to make?\n1: Checking \n2: Savings\n\nChoose a number.");
		int accountType = input.nextInt();
		System.out.println("\n");
		if (accountType == 1) {
			System.out.println("What is your overdraft limit?");
			double limit = input.nextDouble();
			System.out.println("\n");
			Account newChecking = new CheckingAccount(limit);
			list.add(newChecking);
			System.out.println("Your account id is: "
					+ list.lastIndexOf(newChecking));

		} else if (accountType == 2) {
			Account newSaving = new SavingAccount();
			list.add(newSaving);
			System.out.println("Your account id is: "
					+ list.lastIndexOf(newSaving));

		}

		selection(list);

	}

	public static void selection(ArrayList<Account> list) {

		System.out
				.println("MAIN MENU\n\n1. Make Account: \n2. View Account Menu: \n3. Exit: ");
		int selection = input.nextInt();
		System.out.println("\n");
		if (selection == 1) {
			makeAccount(list);
		} else if (selection == 2) {
			viewAccountMenu(list);
		}
	}

	public static void viewAccountMenu(ArrayList<Account> list) {
		System.out.println("Enter your account id to view your account");
		int index = input.nextInt();
		System.out.println("\n");
		System.out.println("Balance: " + list.get(index).getBalance() + " "
				+ list.get(index).toString());
		list.get(index).toString();
		System.out
				.println("What do you want to do?\n 1. Withdraw: \n 2. Deposit: ");
		int choice = input.nextInt();
		System.out.println("\n");
		if (choice == 1) {
			withdraw(index, list);
		} else if (choice == 2) {
			deposit(index, list);
		}
		selection(list);
	}

	public static void withdraw(int index, ArrayList<Account> list) {
		System.out.println("How much do you want to withdraw: ");
		double amount = input.nextDouble();
		System.out.println("\n");
		list.get(index).withdraw(amount);
	}

	public static void deposit(int index, ArrayList<Account> list) {
		System.out.println("How much do you want to deposit: ");
		double amount = input.nextDouble();
		System.out.println("\n");
		list.get(index).deposit(amount);
	}
}
