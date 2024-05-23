package ComportamientoStrategy2;

public class EfectivoStrategy implements IFormaPagoStrategy {
	
	@Override
	public void pago(int monto) {
		System.out.println("El pago es en efectivo. total: $" + monto);
		
	}
}
