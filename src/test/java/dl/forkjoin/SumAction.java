package dl.forkjoin;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class SumAction extends RecursiveTask {
	
	private static final int SEQUENTIAL_THRESHOLD = 3;

	private List<Long> data;

	public SumAction(List<Long> data) {
	    this.data = data;
	 }
	  
	@Override
	protected Object compute() {
		 if (data.size() <= SEQUENTIAL_THRESHOLD) {
			 long sum = computeSumDirectly();
		      System.out.format("Sum of %s: %d\n", data.toString(), sum);
		    } else { 
		    	int mid = data.size() / 2;
		    	  SumAction firstSubtask = new SumAction(data.subList(0, mid));
		    	  SumAction secondSubtask = new SumAction(data.subList(mid, data.size()));
		    	  firstSubtask.fork();
		    	  secondSubtask.compute();
		    	  firstSubtask.join();
		 }
		return null;
	}

	private long computeSumDirectly() {
		long sum = 0;
	    for (Long l: data) {
	      sum += l;
	    }
	    return sum;
	}

	public static void main(String[] args) {
		Random random = new Random();
		List<Long> data = random
		        .longs(10, 1, 5)
		        .boxed()
		        .collect(Collectors.toList());

		    ForkJoinPool pool = new ForkJoinPool();
		    SumAction task = new SumAction(data);
		    pool.invoke(task);
	}
	
}
