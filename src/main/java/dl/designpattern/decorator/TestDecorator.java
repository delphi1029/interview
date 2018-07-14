package dl.designpattern.decorator;

public class TestDecorator {
	
	
	public static void main(String[] args) {
		Pizza pizza = new BasePizza();
		
		Sauce pizzaWithSauce = new Sauce(pizza);
		Cheese pizzaWithSauceandSheese = new Cheese(pizzaWithSauce);
		
		System.out.println(pizzaWithSauceandSheese.cost());
		
	}
	
	
	
}
