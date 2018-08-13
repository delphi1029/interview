package dl.java8.domain;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
		
		//finding max transaction by value
		Comparator<Transaction> comp = Comparator.comparingInt(Transaction::getValue);
		Optional<Transaction> trans = list.stream().collect(Collectors.maxBy(comp));
		System.out.println(trans);
		
		//Add values of all the transaction
		int sum = list.parallelStream().mapToInt(Transaction::getValue).reduce(0,Integer :: sum);
		System.out.println(sum);
		
	}

}
