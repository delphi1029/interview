package dl.thread.deadlock;

public class TestDeadlock {

	
	public static void main(String[] args) {
		
		 Object lock1 = new Object();
		 Object lock2 = new Object();
		
		 Runnable r1 = new Runnable() {
			 	public void run() {
			 		for(int i=0; i<100; i++) {
						 synchronized(lock1) {
							 System.out.println("R1 : Lock 1");
							 synchronized(lock2) {
								 System.out.println("R1 : Lock 2");
							 }
						 }
			 		}
				 }
		 };
		 
		 Runnable r2 = new Runnable() {
			 public void run() {
				 for(int i=0; i<100; i++) {
					 synchronized(lock2) {
						 System.out.println("R2 : Lock 2");
						 synchronized(lock1) {
							 System.out.println("R2 : Lock 1");
						 }
					 }
				 }
			 }
		 };
		 
		 Thread t1 = new Thread(r1);
		 Thread t2 = new Thread(r2);
		 
		 t1.start();
		 t2.start();
		
	}

}
