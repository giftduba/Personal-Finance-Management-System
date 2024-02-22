package qustion2;

public class Input {
	 private int pay;
	    private int unpay;
	    private int paymentOutstanding1;
	    private int paymentOutstanding2;

	    public Input(int pay, int unpay, int paymentOutstanding1, int paymentOutstanding2) {
	        super();
	        this.pay = pay;
	        this.unpay = unpay;
	        this.paymentOutstanding1 = paymentOutstanding1;
	        this.paymentOutstanding2 = paymentOutstanding2;
	    }
		@Override
		public String toString() {
			return "Input pay " + pay + ", unpay " + unpay + ", paymentOutstanding1 " + paymentOutstanding1
					+ ", paymentOutstanding2 " + paymentOutstanding2 + " ";
		}
		 public int calculateTotalOutstanding() {
		        return paymentOutstanding1 + paymentOutstanding2;
		    }
		 public int getPay() {
		        return pay;
		    }
 
		    public void setPay(int pay) {
		        this.pay = pay;
		    }

		    public int getUnpay() {
		        return unpay;
		    }

		    public void setUnpay(int unpay) {
		        this.unpay = unpay;
		    }

		    public int getPaymentOutstanding1() {
		        return paymentOutstanding1;
		    }

		    public void setPaymentOutstanding1(int paymentOutstanding1) {
		        this.paymentOutstanding1 = paymentOutstanding1;
		    }

		    public int getPaymentOutstanding2() {
		        return paymentOutstanding2;
		    }

		    public void setPaymentOutstanding2(int paymentOutstanding2) {
		        this.paymentOutstanding2 = paymentOutstanding2;
		    }
}
