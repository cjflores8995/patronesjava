package ComportamientoStrategy2;

public class TarjetaCreditoStrategy implements IFormaPagoStrategy {
	
	@Override
	public void pago(int monto) {
		
		int comision= monto * 6 / 100 ;
		
		System.out.println("El pago es en transferencia. total: $" + monto + " + " + comision + " = " + (monto + comision));
		
	}
}