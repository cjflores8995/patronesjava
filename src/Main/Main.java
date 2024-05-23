package Main;

import ComportamientoStrategy.ContextShoppingCart;
import ComportamientoStrategy.CreditCardPayment;
import ComportamientoStrategy.PaypalPayment;
import ComportamientoStrategy2.ContextStrategy;
import ComportamientoStrategy2.EfectivoStrategy;
import ComportamientoStrategy2.IFormaPagoStrategy;
import ComportamientoStrategy2.TarjetaCreditoStrategy;
import ComportamientoStrategy2.TransferenciaStrategy;
import CreacionalFactory.PizzaJamonCreator;
import CreacionalFactory.PizzaPepperoni;
import CreacionalFactory.PizzaPepperoniCreator;
import CreacionalSingleton.Singleton;
import EstructuralFacade.ComputerFacade;

public class Main {

	public static void main(String[] args) {
		/*
		Singleton firstSingleton = Singleton.getInstance("FOO");
		Singleton secondSingleton = Singleton.getInstance("BAR");
		
		System.out.println(firstSingleton.value);
		System.out.println(secondSingleton.value);
		*/
		
		/*
		ContextShoppingCart cart = new ContextShoppingCart();
		
		cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9874-4561"));
		cart.pay(100);
		
		cart.setPaymentStrategy(new PaypalPayment("carlos@uisraerl.edu.ec"));
		cart.pay(211);
		*/
		
		/*
		ContextStrategy pago = new ContextStrategy();
		pago.setContextStrategy(new EfectivoStrategy());
		pago.pagoFinal(100);
		
		pago.setContextStrategy(new TarjetaCreditoStrategy());
		pago.pagoFinal(100);
		
		pago.setContextStrategy(new TransferenciaStrategy());
		pago.pagoFinal(100);
		*/
		
		/*
		var jamonCreator = new PizzaJamonCreator();
		var pizzaJamon = jamonCreator.crearPizza();
		pizzaJamon.mostrarIngredientes();
		
		var pepperoniCreator = new PizzaPepperoniCreator();
		var pizzaPepperoni = pepperoniCreator.crearPizza();
		pizzaPepperoni.mostrarIngredientes();
		*/
		
		ComputerFacade computer = new ComputerFacade();
		computer.start();
	}

}
