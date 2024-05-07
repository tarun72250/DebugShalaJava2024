package day_12_abstractAssignment;

import java.util.Scanner;

public class A_03_AccountTypesDemo {

	 public static void main(String[] args) {
	      
		 	Scanner scanner = new Scanner(System.in);

	        // Prompt user to choose account type
	        System.out.println("Choose an account type:");
	        System.out.println("1. Savings Account");
	        System.out.println("2. Current Account");
	        System.out.println("3. Recurring Account");
	        int choice = scanner.nextInt();

	        // Create account based on user choice
	        A_03_Account account = null;
	        switch (choice) {
	            case 1:
	                account = new A_03_SavingAccount(101, "Savings Account", 10000);
	                break;
	            case 2:
	                account = new A_03_CurrentAccount(102, "Current Account", 50000, 50000);
	                break;
	            case 3:
	                account = new A_03_RecurringAccount(103, "Recurring Account", 20000, 2000, 12);
	                break;
	            default:
	                System.out.println("Invalid choice. Exiting program.");
	                return;
	        }

	        // Prompt user to perform actions on the selected account
	        System.out.println("Choose an action:");
	        System.out.println("1. Withdraw");
	        System.out.println("2. Calculate Balance");
	        int action = scanner.nextInt();

	        // Perform action based on user choice
	        switch (action) {
	            case 1:
	                System.out.println("Enter withdrawal amount:");
	                double withdrawAmount = scanner.nextDouble();
	                account.withdraw(withdrawAmount);
	                break;
	            case 2:
	                account.calculateBalance();
	                break;
	            default:
	                System.out.println("Invalid action. Exiting program.");
	                break;
	        }

	        // Display account details
	        System.out.println("Updated Account Details:");
	        account.display();

	        scanner.close();
	    }
}
