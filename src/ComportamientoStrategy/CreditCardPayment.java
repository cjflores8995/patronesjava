package ComportamientoStrategy;

public class CreditCardPayment implements IPaymentStrategy {

	private String cardNumber;
	
	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("El pago de $" + amount + " fue realizado con la tarjeta de credito: " + this.cardNumber);
	}

}
