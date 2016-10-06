package max.factoryPattern;

public class ChicagoPizzaStore extends PizzaStore
{

	
	public Pizza createPizza(String p_Type) 
	{
		if(p_Type.equals("cheese"))
		{
			return new ChicagoStyleCheesePizza();
		}
		
		return null;
	}
	
}
