package dl.datastructures.singlelinkedlist;

public class SLLStack {

	SLLNode head;
	
	public void push(int data) {
		if(head == null) {
			head = new SLLNode(data);
		} else {
			SLLNode node = new SLLNode(data);
			node.next = head;
			head = node;
		}
	}
	
	public int pop() {
		if(head == null) {
			throw new RuntimeException("Stack is empty");
			
		}
		int data = head.data;
		head  = head.next;
		return data;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
}
