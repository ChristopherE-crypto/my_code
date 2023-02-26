package week2;

public class RemoveDuplicate {
	
	static class SinglyLinkedListNode {
		
		public int data;
		public SinglyLinkedListNode next;
		
		public SinglyLinkedListNode(int nodeData) {
			
			this.data = nodeData;
			this.next = null;
		}
	}
	
	static class SinglyLinkedList {
		
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;
		
		public SinglyLinkedList() {
			
			this.head = null;
			this.tail = null;
		}
		
		public void insertNode(int nodeData) {
			
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
			
			if(this.head == null) {
				
				this.head = node;
			}
			else {
				
				this.tail.next = node;
			}
			
			this.tail = node;
		}
		
		public void print() {
			
			if(this.head == null) {
				
				System.out.println("Empty List!");
			}
			else {
				
				SinglyLinkedListNode curNode = this.head;
				
				while(curNode != null) {
					
					System.out.println("-> " + curNode.data);
					
					curNode = curNode.next;
				}
			}
		}
	}
	
	public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode node) {
		
		SinglyLinkedListNode curNode = node;
		int prev = -1;
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		while(curNode != null) {
			
			if(prev != curNode.data) {
				
				prev = curNode.data;
				list.insertNode(curNode.data);
			}
			
			curNode = curNode.next;
		}
		
		return list.head;
	}

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		
		SinglyLinkedListNode newHead = removeDuplicates(list.head);
		
		System.out.println("NEW HEAD -> " + newHead.data);
		
		SinglyLinkedList list2 = new SinglyLinkedList();
		
		list2.insertNode(newHead.data);
		
		list2.print();

	}

}
