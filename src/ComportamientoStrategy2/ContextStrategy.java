package ComportamientoStrategy2;

public class ContextStrategy {
	private IFormaPagoStrategy _strategy;
	
	public ContextStrategy() {
		// TODO Auto-generated constructor stub
	}

	public void setContextStrategy(IFormaPagoStrategy strategy) {
		this._strategy = strategy;
	}
	
	public void pagoFinal(int amount) {
		_strategy.pago(amount);
	}
}
