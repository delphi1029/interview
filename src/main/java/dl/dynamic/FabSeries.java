package dl.dynamic;

public class FabSeries {
	
	private int[] mem;
	
	
	public FabSeries(int n) {
		super();
		this.mem = new int[n+1];
	}

	public int fab(int n) {
		int result = 0;
		if(mem[n] != 0)
			return mem[n];
		if(n==1 || n==2)
			result = 1;
		else
			result = fab(n-1)+fab(n-2);
		mem[n] = result; 
		
		return result;
	}
	
	public int fab_bottomup(int n) {
		
		mem[1] = 1;
		mem[2] = 1;
		
		for(int i=3;i<=n;i++) {
			mem[i] = mem[i-1]+mem[i-2];
		}
		
		return mem[n];
	}

	public static void main(String[] args) {
		
		FabSeries s = new FabSeries(7);
		//System.out.println(s.fab(6));
		
		System.out.println(s.fab_bottomup(7));
	}

}
