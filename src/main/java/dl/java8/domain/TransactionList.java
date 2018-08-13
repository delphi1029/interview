package dl.java8.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransactionList {
	
	private static List<Transaction> list = new ArrayList<>();
	
	static {
		Trader ayan = new Trader ("Ayan", "Delhi");
		Trader deepak= new Trader ("Deepak", "Banglore");
		Trader vijaya = new Trader ("Vijaya", "Germany");
		Trader sunny = new Trader ("Sunny", "US");
		
		list = Arrays.asList(
			new Transaction(ayan,"EUR",2011, 300),
			new Transaction(deepak,"GBP",2012, 1000),
			new Transaction(deepak,"GBP",2011, 400),
			new Transaction(vijaya,"EUR",2012, 710),
			new Transaction(vijaya,"GBP",2012, 700),
			new Transaction(sunny,"USD",2012, 950)
			);
	}

	public static List<Transaction> getList() {
		return list;
	}
	
	

}
