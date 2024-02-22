package qustion2;

public class StartState extends PaymentTracker {
    public StartState(int pay, int unpay, int paymentOutstanding1, int paymentOutstanding2) {
		super(pay, unpay, paymentOutstanding1, paymentOutstanding2);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void showMenu() {
        System.out.println("1. Enter new payment");
        System.out.println("2. Show total payments");
        System.out.println("0. Quit");
    }
}

public class WaitingForInputState extends PaymentTracke {
    @Override
    public void showMenu() {
        System.out.println("Enter payment details: ");
        // Assume user inputs the payment details here
        System.out.println("Payment added successfully.");
    }
}

public class ShowingResultsState extends PaymentTracke {
    @Override
    public void showMenu() {
        // Assume totalPayments is a variable that stores the total payments
        System.out.println("Total payments: " + totalPayments);
    }
}

public class InvalidInputState extends PaymentTracke{
    @Override
    public void showMenu() {
        System.out.println("Invalid input. Please try again.");
    }
}


