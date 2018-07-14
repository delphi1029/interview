package dl.designpattern.decorator;

public class Cheese extends PizzaDecorator {
	Pizza pizza;

	public Cheese(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public double cost() {
		return (this.pizza.cost() + 1.2);
	}

}
