package ComportamientoStrategy;

public class PaypalPayment implements IPaymentStrategy {

	private String email;
	
	public PaypalPayment(String email) {
		this.email = email;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("El pago de $" + amount + " se realizo con la cuenta Paypal: " + email);
	}

}
