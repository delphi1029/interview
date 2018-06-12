package dl.tree;

public class TreeNode {
	
	private int data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	
	
	public TreeNode(int data) {
		super();
		this.data = data;
	}

	public void insert(int nodeData) {
		if(this.data == nodeData) {
			return;
		}
		
		if(nodeData < this.data) {
			if(this.leftNode == null) {
				this.leftNode = new TreeNode(nodeData);
			} else {
				leftNode.insert(nodeData);
			}
		} else {
			if(this.rightNode == null) {
				this.rightNode = new TreeNode(nodeData);
			} else {
				rightNode.insert(nodeData);
			}
		}
	}
	
	public void traverseInOrder() {
		if(leftNode != null) {
			leftNode.traverseInOrder();
		}
		System.out.println(data);
		
		if(rightNode != null) {
			rightNode.traverseInOrder();
		}
	}
	
	public TreeNode get(int value) {
		if(value == data) {
			return this;
		}
		if(value < data) {
			if(leftNode != null) {
				return leftNode.get(value);
			}
		} else {
			if(rightNode != null) {
				return rightNode.get(value);
			}
		}
		return null;
	}
	
	public int min() {
		
		if(this.leftNode == null) {
			return this.data;
		} else {
			return this.leftNode.min();
		}
		
	}
	
	public int max() {
		if(this.rightNode == null) {
			return this.data;
		} else {
			return this.rightNode.max();
		}
	}

	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public TreeNode getLeftNode() {
		return leftNode;
	}


	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}


	public TreeNode getRiskgtNode() {
		return rightNode;
	}


	public void setRiskgtNode(TreeNode riskgtNode) {
		this.rightNode = riskgtNode;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}
	
	
	

}
