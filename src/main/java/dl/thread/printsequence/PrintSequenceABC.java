package dl.thread.printsequence;

public class PrintSequenceABC {

	public static void main(String[] args) {
		MyLock lock = new MyLock();
		Thread t1 = new Thread(new PrintATask(lock));
		Thread t2 = new Thread(new PrintBTask(lock));
		Thread t3 = new Thread(new PrintCTask(lock));
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class MyLock {
	Integer threadToRun = 1 ;
}


class PrintATask implements Runnable {

	private MyLock lock;
	
	public PrintATask(MyLock lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		int i=10;
		while(i>0) {
			synchronized (lock) {
				while(lock.threadToRun != 1) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("A");
				lock.threadToRun = 2;
				lock.notifyAll();
			}	
			i--;
		}
	}
	
}

class PrintBTask implements Runnable {

	private MyLock lock;
	
	public PrintBTask(MyLock lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		int i=10;
		while(i>0) {
			synchronized (lock) {
				while(lock.threadToRun != 2) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("B");
				lock.threadToRun = 3;
				lock.notifyAll();
			}	
			i--;
		}
	}
	
}

class PrintCTask implements Runnable {
	
	private MyLock lock;
	
	public PrintCTask(MyLock lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		int i=10;
		while(i>0) {
			synchronized (lock) {
				while(lock.threadToRun != 3) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("C");
				lock.threadToRun = 1;
				lock.notifyAll();
			}	
			i--;
		}
	
		
	}
	
}
