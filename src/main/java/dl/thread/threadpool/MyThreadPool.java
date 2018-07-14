package dl.thread.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadPool {
	
	private BlockingQueue<Runnable> taskQueue;
	private int noOfThreads;
	private List<Thread> workers;
	private volatile boolean isRunning = true;
	
	
	public MyThreadPool(int noOfThreads) {
		super();
		this.noOfThreads = noOfThreads;
		this.taskQueue = new LinkedBlockingQueue<Runnable>();
		this.workers = new ArrayList<>();
		initializeThreads();
	}


	private void initializeThreads() {
		for(int i=0; i<noOfThreads; i++) {
			Thread t = new Thread() {
				public void run() {
					while(isRunning) {
						try {
							Runnable task = taskQueue.take();
							task.run();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			
			t.start();
			this.workers.add(t);
		}
	}
	
	public void execute(Runnable task) throws InterruptedException {
		taskQueue.put(task);
	}
	
	public void shutDown() {
			isRunning = false;
	}
	
	

}
