package dl.forkjoin.findmax;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class App {

	public static final int THRESHOLD = 0;

	public static void main(String[] args) {
		int a[] = initialize();
		ForkJoinPool fp = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		
		ParallelMaxFinding pt = new ParallelMaxFinding(a,0,a.length-1);
		int result = fp.invoke(pt);
		System.out.println(result);

	}

	private static int[] initialize() {
		int[] a = new int[10000];
		Random r = new Random();
		for(int i=0;i<10000;i++) {
			a[i] = r.nextInt(100000);
		}
		return a;
	}

}
