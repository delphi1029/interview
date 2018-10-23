package dl.thread.lock;

public class MyLock {
	
	private boolean isLocked = false;
	private Thread lockOwner = null;
	
	
	public synchronized void lock() throws InterruptedException {
		while(isLocked) {
			wait();
		}
		isLocked = true;
		lockOwner = Thread.currentThread();
	}
	
	public synchronized void unlock() {
		if(Thread.currentThread() != lockOwner) {
			throw new RuntimeException("Not locked by this thread");
		}
		isLocked = false;
		lockOwner = null;
		notifyAll();
	}

}
