package dl.tree;

public class Tree {
	
	private TreeNode root;
	
	public void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		} else {
			root.insert(value);
		}
	}
	
	public void traverseInOrder() {
		if(root == null) {
			return;
		} 
		
		root.traverseInOrder();
	}
	
	public TreeNode get(int value) {
		if(root != null) {
			return root.get(value);
		} 
		return null;
	}
	
	public int min() {
		if(root != null) {
			return root.min();
		}
		return 0;
	}
	
	public int max() {
		if(root != null) {
			return root.max();
		}
		return 0;
	}
	
	public void delete(int value) {
		root = delete(root,value);
	}
	
	

	public static void main(String[] args) {
		Tree t = new Tree();
		
		t.insert(25);
		t.insert(20);
		t.insert(15);
		t.insert(27);
		t.insert(30);
		t.insert(29);
		t.insert(26);
		t.insert(22);
		t.insert(32);
		
		//t.traverseInOrder();
		System.out.println(t.min());
		System.out.println(t.max());
		//System.out.println(t.get(26));
		//System.out.println(t.get(36));
	}
}
