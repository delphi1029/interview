package dl.datastructures.singlelinkedlist;

import org.junit.Assert;

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
	
	/*
	 * 1  2 > 3 > null
	 * 
	 * 
	 */
	
	public SLLNode reverse(SLLNode head) {
		SLLNode node = head;
		SLLNode next = null;
		SLLNode prev = null;
		
		while(node != null) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}
		
		return prev;
	}
	
	
	
	public SLLNode cloneList(SLLNode  head) {
		
		SLLNode node = head;
		SLLNode startNew = null;
		SLLNode prev = null;
		
		while(node!= null) {
			SLLNode temp = new SLLNode(node.data);
			if(startNew == null) {
				startNew = temp;
				prev = temp;
			} else {
				prev.next = temp;
				prev = temp;
			}
			node = node.next;
		}
		
		return startNew;
		
	}
	
	/*
	 *  1 -> 2 -> 3
	 *  null <- 1 2-> 3
	 *  
	 *  
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		SLLOperations sllOprations = new SLLOperations();
		SLLNode node1 = new SLLNode(4);
		SLLNode node2 = new SLLNode(41);
		SLLNode node3 = new SLLNode(412);
		SLLNode node4 = new SLLNode(423);
		SLLNode node5 = new SLLNode(434);
		SLLNode node6 = new SLLNode(445);
		
		SLLNode head = sllOprations.addNode(null, node1);
	
		
		head = sllOprations.addNode(head, node2);
		head = sllOprations.addNode(head, node3);
		head = sllOprations.addNode(head, node4);
		head = sllOprations.addNode(head, node5);
		head = sllOprations.addNode(head, node6);
		
		sllOprations.printList(head);
		
		SLLNode abc = sllOprations.reverse(head);
		sllOprations.printList(abc);
	}

}
