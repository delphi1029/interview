package dl.java8.domain;

public class Transaction {
	
	private final Trader trader;
	private final String currency;
	private final int year;
	private final int value;
	
	public Transaction(Trader trader, String currency, int year, int value) {
		super();
		this.trader = trader;
		this.currency = currency;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public String getCurrency() {
		return currency;
	}
	public int getYear() {
		return year;
	}
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", currency=" + currency + ", year=" + year + ", value=" + value + "]";
	}
	
	
}
