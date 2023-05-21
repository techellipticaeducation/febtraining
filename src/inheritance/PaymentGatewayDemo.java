package inheritance;

public class PaymentGatewayDemo {
	public static void main(String[] args) {
		// zomato 
		PaymentGateway bank  = new HDFC();
		bank.rate();
	}
}

class PaymentGateway{
	public void rate() {
		System.out.println("1.0");
	}
}

class HDFC extends PaymentGateway{
	public void rate() {
		System.out.println("0.5");
	}
	public void hdfcrate() {
		System.out.println("extra hdfc ");
	}
}

class SBI extends PaymentGateway{
	public void rate() {
		System.out.println("0.8");
	}
	public void sbirate() {
		System.out.println("extra sbi");
	}
}
