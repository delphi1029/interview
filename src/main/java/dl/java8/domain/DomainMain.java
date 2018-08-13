package dl.java8.domain;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DomainMain {

	public static void main(String[] args) {
		List<Transaction> list = TransactionList.getList();
		
		//find all transactions in 2011 and sort by value (small to high)
		List<Transaction> result = list.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());
				
		result.forEach(System.out::println);
		
		//what are the unique cities where the traders work
		List<String> cities = list.stream().map(t -> t.getTrader().getCity())
				.distinct().collect(Collectors.toList());
		cities.forEach(System.out::println);
		
		//grouping transactions by currency
		Map<String,List<Transaction>> transactionsByCurrency = list.stream().collect(Collectors.groupingBy(Transaction::getCurrency));
		System.out.println(transactionsByCurrency);
		
	}

}
