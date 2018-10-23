package dl.designpattern.singleton;

public class BillPughSingleton {
	
	private BillPughSingleton() {
	
	}
	
	public static class SingletonHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}

}
