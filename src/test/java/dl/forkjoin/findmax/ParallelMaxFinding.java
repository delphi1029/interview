package dl.forkjoin.findmax;

import java.util.concurrent.RecursiveTask;

public class ParallelMaxFinding extends RecursiveTask<Integer>{
	
	private int[] a;
	private int low;
	private int high;
	
	public ParallelMaxFinding(int[] a, int low, int high) {
		super();
		this.a = a;
		this.low = low;
		this.high = high;
	}

	@Override
	protected Integer compute() {
		if(high-low > App.THRESHOLD) {
			int mid = (high+low)/2;
			ParallelMaxFinding task1 = new ParallelMaxFinding(a,low,mid);
			ParallelMaxFinding task2 = new ParallelMaxFinding(a,mid+1,high);
			invokeAll(task1,task2);
			
			return Math.max(task1.join(), task2.join());
			
		} else {
			return sequential(a,low,high);
		}
	}

	public Integer sequential(int[] a, int low, int high) {
		int max = a[low];
		
		for(int i = low; i<high;i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
}
