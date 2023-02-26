package week5;

class Node {
	
	public int data;
	public Node next;
	
	public Node(int data) {
		
		this.data = data;
		this.next = null;
	}
	
	public void setNext(Node next) {
		
		this.next = next;
	}
	
	public Node getNext() {
		
		return this.next;
	}
	
	public int getData() {
		
		return this.data;
	}
}

public class Reverse {
	
	public static void printReverse(Node node) {
		
		if(node == null) {
			
			return;
		}
		
		printReverse(node.next);
		
		System.out.println(node.data);
	}
	
	public static void main(String [] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		
		n1.setNext(n2);
		
		n2.setNext(n3);
		
		printReverse(n1);
	}
	

}
