//written by Maxime Bonin

package max.factoryPattern;

import java.util.ArrayList;

public class Pizza 
{
	public String m_Name;
	public String m_Dough;
	public String m_Sauce;
	public ArrayList<String> m_Toppings = new ArrayList<String>();

	public void prepare()
	{
		System.out.println("Preparing "+this.m_Name);
		System.out.println("Tossing dough ...");
		System.out.println("Adding sauce !");
		System.out.println("Adding toppings");
		
		for(int i = 0 ; i < this.m_Toppings.size() ; i++)
		{
			System.out.println(" "+this.m_Toppings.get(i));
		}
	
	}
	
	public void bake()
	{
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut()
	{
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box()
	{
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName()
	{
		return this.m_Name;
	}
}
