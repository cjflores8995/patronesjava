package ComportamientoStrategy2;

public class TransferenciaStrategy implements IFormaPagoStrategy {
	
	@Override
	public void pago(int monto) {
		
		int comision= 1;
		
		System.out.println("El pago es en transferencia. total: $" + monto + " + " + comision + " = " + (monto + comision));
		
	}
}