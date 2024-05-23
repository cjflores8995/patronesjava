package ComportamientoStrategy;

public class ContextShoppingCart {
	private IPaymentStrategy _paymentStrategy;
	
	public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
		this._paymentStrategy = paymentStrategy;
	}
	
	public void pay(int amount) {
		_paymentStrategy.pay(amount);
	}
}