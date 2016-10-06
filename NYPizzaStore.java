package max.factoryPattern;

public class NYPizzaStore extends PizzaStore 
{
	public Pizza createPizza(String p_Type)
	{
		if(p_Type.equals("cheese"))
		{
			return new NyStyleCheesePizza();
		}
		
		return null;
	}
}
