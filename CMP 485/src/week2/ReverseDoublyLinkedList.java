package week2;

public class ReverseDoublyLinkedList {
	
	static class DoublyLinkedListNode {
		
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;
		
		public DoublyLinkedListNode(int nodeData) {
			
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}
	
	static class DoublyLinkedList {
		
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;
		
		public DoublyLinkedList() {
			
			this.head = null;
			this.tail = null;
		}
		
		public void insertNode(int nodeData) {
			
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);
			
			if(this.head == null) {
				
				this.head = null;
			}
			else {
				
				this.tail.next = node;
				node.prev = this.tail;
			}
			
			this.tail = node;
		}
		
		public void print() {
			
			DoublyLinkedListNode curNode = this.head;
			
			while(curNode != null) {
				
				System.out.println("-> " + curNode.data);
			}
		}
	}
	
	public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
		
		if(llist == null) {
			
			return null;
		}
		else {
			
			DoublyLinkedList list = new DoublyLinkedList();
            
            DoublyLinkedListNode curNode = llist;
            
            while(curNode != null){
                
                curNode = curNode.next;
            }
            
            DoublyLinkedListNode lastNode = curNode;
            
            while(lastNode != null){
                
                list.insertNode(lastNode.data);
                
                lastNode = lastNode.prev;
            }
            
            list.insertNode(llist.data);
            
            return list.head;
		}
	}
	
	public static void main(String [] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		
		DoublyLinkedList reverseList = new DoublyLinkedList();
		
		DoublyLinkedListNode head = reverse(list.head);
		
		reverseList.insertNode(head.data);
		
		reverseList.print();
		
		
		
		
	}

}
