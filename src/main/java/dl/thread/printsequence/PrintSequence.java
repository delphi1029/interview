package dl.thread.printsequence;

public class PrintSequence {

	public static void main(String[] args) {
		MyMonitor monitor = new MyMonitor();
		Thread t1 = new Thread(new PrintA(monitor));
		Thread t2 = new Thread(new PrintB(monitor));
		
		t1.start();
		t2.start();
	}
}


class MyMonitor {
	boolean runA = true;
}

class PrintA implements Runnable {
	
	private MyMonitor monitor;
	
	public PrintA(MyMonitor monitor) {
		super();
		this.monitor = monitor;
	}

	@Override
	public void run() {
		int i=10;
		while(i>0) {
			synchronized (monitor) {
				while(!monitor.runA) {
					try {
						monitor.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
					System.out.println("A");
					monitor.runA = false;
					monitor.notifyAll();
			}
			i--;
		}
		
	}
	
}

class PrintB implements Runnable {

	private MyMonitor monitor;
	
	public PrintB(MyMonitor monitor) {
		super();
		this.monitor = monitor;
	}

	@Override
	public void run() {
		int j =10;
		while(j>0) {
			synchronized (monitor) {
					while(monitor.runA) {
						try {
							monitor.wait();
							
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("B");
					monitor.runA = true;
					monitor.notifyAll();
			}
			j--;
		}
	}
	
}
