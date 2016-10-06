//written by Maxime Bonin

package max.factoryPattern;

public class NyStyleCheesePizza extends Pizza 
{
	public NyStyleCheesePizza()
	{
		this.m_Name = "NY Style Sauce and Cheese Pizza";
		this.m_Dough = "Thin Crust Dough";
		this.m_Sauce = "Marinara Sauce";
		
		this.m_Toppings.add("Grated Reggiano Cheese");
	}
}
