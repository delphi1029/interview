package dl.datastructures.singlelinkedlist;


import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSLLOperations {
	
	SLLOperations sllOprations;
	
	@Before
	public void init() {
		sllOprations = new SLLOperations();
	}
	
	
	@Test
	public void testAddNode() {
		SLLNode node1 = new SLLNode(4);
		SLLNode node2 = new SLLNode(41);
		SLLNode node3 = new SLLNode(412);
		SLLNode node4 = new SLLNode(423);
		SLLNode node5 = new SLLNode(434);
		SLLNode node6 = new SLLNode(445);
		
		SLLNode head = sllOprations.addNode(null, node1);
		int size = sllOprations.size(head);
		Assert.assertEquals(1, size);
		
		head = sllOprations.addNode(node1, node2);
		size = sllOprations.size(head);
		Assert.assertEquals(2, size);
		
		head = sllOprations.addNode(node1, node3);
		size = sllOprations.size(head);
		Assert.assertEquals(3, size);
		
		head = sllOprations.addNode(node1, node4);
		size = sllOprations.size(head);
		Assert.assertEquals(4, size);
		
		head = sllOprations.addNode(node1, node5);
		size = sllOprations.size(head);
		Assert.assertEquals(5, size);
		
		head = sllOprations.addNode(node1, node6);
		size = sllOprations.size(head);
		Assert.assertEquals(6, size);

		
	}
	
	
	@Test
	public void testAddNodeAtPosition() {
		SLLNode node1 = new SLLNode(4);
		SLLNode node2 = new SLLNode(41);
		SLLNode node3 = new SLLNode(412);
		SLLNode node4 = new SLLNode(423);
		SLLNode node5 = new SLLNode(434);
		SLLNode node6 = new SLLNode(445);
		
		SLLNode head = sllOprations.addNode(null, node1);
		int size = sllOprations.size(head);
		Assert.assertEquals(1, size);
		
		head = sllOprations.addNode(node1, node2);
		size = sllOprations.size(head);
		Assert.assertEquals(2, size);
		
		head = sllOprations.addNode(node1, node3);
		size = sllOprations.size(head);
		Assert.assertEquals(3, size);
		
		head = sllOprations.addNode(node1, node4);
		size = sllOprations.size(head);
		Assert.assertEquals(4, size);
		
		head = sllOprations.addNode(node1, node5);
		size = sllOprations.size(head);
		Assert.assertEquals(5, size);
		
		head = sllOprations.addNode(node1, node6);
		size = sllOprations.size(head);
		Assert.assertEquals(6, size);

		sllOprations.printList(node1);

		SLLNode node7 = new SLLNode(120);
		
		head = sllOprations.addNodeAtPosition(node1, node7,3);
		sllOprations.printList(node1);
		
		SLLNode node8 = new SLLNode(0);
		head = sllOprations.addNodeAtPosition(node1, node8,5);
		sllOprations.printList(node1);
		
		System.out.println(sllOprations.getNode(head, 6));
		
		System.out.println(sllOprations.nthNodeFromTheEnd(head, 4));
		
	}
	
	public SLLNode testGetNode() {
		return null;
	}
	
	public SLLNode testDeleteNode() {
		return null;
	}
	
	public SLLNode testPrintList() {
		return null;
	}

}
