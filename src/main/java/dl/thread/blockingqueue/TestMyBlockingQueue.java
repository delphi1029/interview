package dl.thread.blockingqueue;

public class TestMyBlockingQueue {
	
	public static void main(String[] args) {
		MyBlockingQueue<Integer> queue = new MyBlockingQueue<Integer>(2);
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0; i < 20; i++) {
					try {
						queue.put(new Integer(i));
						System.out.println("Putting object - "+i);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(5000);
						System.out.println("Taking object - "+queue.take());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
