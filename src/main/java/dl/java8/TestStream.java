package dl.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dl.java8.Dish.Type;

public class TestStream {
	
	//filter Veg dishes and print
	public static void filterVegDishes(List<Dish> dishes) {
		List<Dish> vegDishes = dishes.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
		vegDishes.stream().forEach(System.out::println);
	}
	
	//filter MEAT dishes
	public static void filterMeatDishes(List<Dish> dishes) {
		List<Dish> vegDishes = dishes.stream().filter(d -> d.getType() == Type.MEAT).collect(Collectors.toList());
		vegDishes.stream().forEach(System.out::println);
	}
	
	//filter Veg dishes name using map()
	public static void filterVegDishesName(List<Dish> dishes) {
		List<String> vegDishesName = dishes.stream().filter(Dish::isVegetarian).map(Dish::getName)
				.collect(Collectors.toList());
		vegDishesName.stream().forEach(System.out::println);
	}
	
	//map example // out put is - 3  3  5
	public static void mapExample() {
		List<Integer> evens = Arrays.asList(2, 4, 6);
		List<Integer> odds = Arrays.asList(3, 5, 7);
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);

		 List<Integer> list = Stream.of(evens,odds,primes).map(List::size).collect(Collectors.toList());
		 list.stream().forEach(System.out::println);
	}
	
	//Flat map example
	public static void flatMapExample() {
		List<Integer> evens = Arrays.asList(2, 4, 6);
		List<Integer> odds = Arrays.asList(3, 5, 7);
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);

		List<Integer> list = Stream.of(evens, odds, primes)
				.flatMap(l -> l.stream())
				.collect(Collectors.toList());
	 
	}
	
	//Reduce add numbers in a list
	public static void addNumbers() {
		List<Integer> num = Arrays.asList(2, 3, 5, 7, 11,55,32,21);
		Integer sum = num.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		Integer sumEven = num.stream().filter(a -> a%2==0).reduce(0, (a,b) -> a+b);
		System.out.println(sumEven);
	}
	
	public static void main(String[] args) {
		List<Dish> dishes = DishCollection.getDishes();
		filterVegDishes(dishes);
		System.out.println("------------");
		filterMeatDishes(dishes);
		System.out.println("------------");
		filterVegDishesName(dishes);
		System.out.println("------------");
		addNumbers();
	}

}
