//written by Maxime Bonin

package max.factoryPattern;

public abstract class PizzaStore 
{
	public Pizza orderPizza(String p_Type)
	{
		Pizza pizza;
		
		pizza = createPizza(p_Type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
