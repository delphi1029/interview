package dl.datastructures.singlelinkedlist;

public class SLLOperations {
	
	public SLLNode addNode(SLLNode head, SLLNode nodeToAdd) {
		SLLNode tempNode = head;
		
		if(tempNode == null)
			return nodeToAdd;
	
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		
		tempNode.next = nodeToAdd;
		return head;
	}
	
	public SLLNode addNodeAtPosition(SLLNode head, SLLNode nodeToAdd, int position) {
		
		SLLNode tempNode = head;
		if(position == 1 && head == null) {
			return nodeToAdd;
		}
		
		for(int i=1; i<position-1 ; i++) {
			tempNode = tempNode.next;
		}
		
		nodeToAdd.next = tempNode.next;
		tempNode.next = nodeToAdd;
		return head;
	}
	
	public SLLNode getNode(SLLNode head,int position) {
		SLLNode node = head;
		
		for(int i=0; i<position-1; i++) {
			node = node.next;
		}
		
		return node;
	}
	
	public SLLNode deleteNode(SLLNode head,int position) {
		return null;
	}
	
	public void printList(SLLNode head) {
		
		while(head != null) {
			System.out.print(head.toString());
			 head = head.next;
		}
		System.out.println();
	}
	
	public int size(SLLNode head) {
		int size = 0;
		while(head != null) {
			size++;
			head = head.next;
		}
		return size;
	}
	
	public SLLNode nthNodeFromTheEnd(SLLNode head,int position) {
		SLLNode p1 = head;
		SLLNode p2 = head;
		int i=0;
		
		
		while(p1 != null) {
			p1 = p1.next;
			i++;
			if(i>position) {
				p2 = p2.next;
			}
		}
		return p2;
	}

}
