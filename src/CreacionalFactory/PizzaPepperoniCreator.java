package CreacionalFactory;

public class PizzaPepperoniCreator implements IPizzaCreator {

	@Override
	public IPizza crearPizza() {
		return new PizzaPepperoni();
	}
}