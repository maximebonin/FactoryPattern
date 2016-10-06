//written by Maxime Bonin

package max.factoryPattern;

public class ChicagoStyleCheesePizza extends Pizza 
{
	public ChicagoStyleCheesePizza()
	{
		this.m_Name = "Chicago Style Sauce and Cheese Pizza";
		this.m_Dough = "Thin Crust Dough";
		this.m_Sauce = "Marinara Sauce";
		
		this.m_Toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut()
	{
		System.out.println("Cutting the pizza into square slices");
	}
}
