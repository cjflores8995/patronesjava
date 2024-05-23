package CreacionalFactory;

public class PizzaJamonCreator implements IPizzaCreator {

	@Override
	public IPizza crearPizza() {
		return new PizzaJamon();
	}
}
