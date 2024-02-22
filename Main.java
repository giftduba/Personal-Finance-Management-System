package qustion2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assume these values are user inputs or fetched from database
        
        PaymentTracker tracker = new PaymentTracker(0, 0, 0, 0);

        System.out.println("Payment: " + tracker.calculatePayment());
        System.out.println("Remaining Outstanding: " + tracker.calculateRemainingOutstanding());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to see your balance or 2 to see how much is outstanding and how much is unpaid balance: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Payment: " + tracker.calculatePayment());
            System.out.println("Unpaid Balance: " + tracker.calculateUnpaidBalance());
            
        } else if (choice == 2) {
            System.out.println("Remaining Outstanding: " + tracker.calculateRemainingOutstanding());
            System.out.println("Unpaid Balance: " + tracker.calculateUnpaidBalance()); 
            
        } else {
            System.out.println("Invalid choice.");
           
        }
        return;
    }
}

	 