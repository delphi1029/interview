package dl.designpattern.decorator;

public class Sauce extends PizzaDecorator {

	Pizza pizza;

	public Sauce(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public double cost() {
		return (this.pizza.cost() + 0.5);
	}
}
