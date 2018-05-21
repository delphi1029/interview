package dl.thread.deadlock;


public class TestDeadLock {

	Object lock1 = new Object();
	Object lock2 = new Object();
	
	
	Thread t1 = new Thread() {
		public void run() {
			while(true) {
				synchronized (lock2) {
					synchronized (lock1) {
						System.out.println("Inside thread 1");
					}
				}
			}
			
		}
	};
	
	Thread t2 = new Thread() {
		public void run() {
			while(true) {
				synchronized (lock1) {
					synchronized (lock2) {
						System.out.println("Inside thread 2");
					}
				}
			}
			
		}
	};

	public static void main(String[] args) {
		TestDeadLock dl = new TestDeadLock();
		dl.t1.start();
		dl.t2.start();
	}

}


