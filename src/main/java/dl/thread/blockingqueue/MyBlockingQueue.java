package dl.thread.blockingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueue<T> {
	
	private Integer maxCapacity;
	private Queue<T> queue;
	
	
	public MyBlockingQueue(Integer maxCapacity) {
		super();
		this.maxCapacity = maxCapacity;
		this.queue = new LinkedList<>();
	}
	
	
	public void put(T obj) throws InterruptedException {
		synchronized (queue) {
			while(queue.size() >= maxCapacity) {
				queue.wait();
			}
			queue.add(obj);
			queue.notifyAll();
		}
	}
	
	public T take() throws InterruptedException {
		T obj = null;
		synchronized (queue) {
			while(queue.size() <= 0) {
				queue.wait();
			}
			obj = queue.poll();
			queue.notifyAll();
		}
		return obj;
	}
	
	
	

}
