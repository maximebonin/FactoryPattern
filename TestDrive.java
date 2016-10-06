//written by Maxime Bonin

package max.factoryPattern;

public class TestDrive {

	public static void main(String[] args) 
	{
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName()+" \n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Mary ordered a "+pizza.getName()+" \n");
	}

}
