package qustion2;

public class PaymentTracker {
    private int pay;
    private int unpay;
    private int paymentOutstanding1;
    private int paymentOutstanding2;

    public PaymentTracker(int pay, int unpay, int paymentOutstanding1, int paymentOutstanding2) {
        this.pay = pay;
        this.unpay = unpay;
        this.paymentOutstanding1 = paymentOutstanding1;
        this.paymentOutstanding2 = paymentOutstanding2;
    }

    public int calculatePayment() {
        return pay - unpay;
    }

    public int calculateRemainingOutstanding() {
        int payment = calculatePayment();
        return paymentOutstanding1 + paymentOutstanding2 - payment;
    }

    public int calculateUnpaidBalance() {
        return unpay;
    }
}





