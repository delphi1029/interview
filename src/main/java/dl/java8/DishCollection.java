package dl.java8;

import java.util.ArrayList;
import java.util.List;

import dl.java8.Dish.Type;

public class DishCollection {
	
	private static List<Dish> dishes = new ArrayList<>();;

	static {
		dishes.add(new Dish("Chicken Tikka",  false, 700, Type.MEAT));
		dishes.add(new Dish("Paneer Tikka",  true, 500, Type.OTHER));
		dishes.add(new Dish("Veg Salad",  true, 200, Type.OTHER));
		dishes.add(new Dish("Chicken Salad",  false, 300, Type.MEAT));
		dishes.add(new Dish("Fish Tikka",  false, 600, Type.FISH));
		dishes.add(new Dish("Sushi",  false, 700, Type.FISH));
		dishes.add(new Dish("Meat Balls",  false, 900, Type.MEAT));
		dishes.add(new Dish("Veg Sandwitch",  true, 450, Type.OTHER));
		dishes.add(new Dish("Milk",  true, 300, Type.OTHER));
		dishes.add(new Dish("Cake",  false, 650, Type.OTHER));
		dishes.add(new Dish("Chicken Pizza",  false, 700, Type.MEAT));
		dishes.add(new Dish("Veg Pizza",  true, 500, Type.OTHER));
		dishes.add(new Dish("Oats",  true, 200, Type.OTHER));
		dishes.add(new Dish("Chocolate Cake",  false, 900, Type.OTHER));
		
	}
	
	public DishCollection() {
		super();
	}

	public static List<Dish> getDishes() {
		return dishes;
	}
	

}
