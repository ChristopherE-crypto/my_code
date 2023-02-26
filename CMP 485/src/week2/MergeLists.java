package week2;

public class MergeLists {
	
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
	}
	
	public int countNodes(SinglyLinkedListNode head) {
		
		if(head == null) {
			
			return 0;
		}
		else {
			
			SinglyLinkedListNode curNode = head;
			
			int count = 0;
			
			while(curNode != null) {
				
				count++;
				
				curNode = curNode.next;
			}
			
			return count;
		}
	}
	
	public void insertSorted(int nodeData) {
		
		
	}
	
	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		
		if(head1 == null && head2 != null){
            
            return head2;
        }
        
        if(head1 != null && head2 == null){
            
            return head1;
        }
        
        if(head1 == null && head2 == null){
            
            return null;
        }
        
        // Create two lists, each for each head.
        
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        
        // Final sorted list.
        
        SinglyLinkedList list = new SinglyLinkedList();
        
        // Add the elements to each list.
        
        SinglyLinkedListNode t1 = head1;
        SinglyLinkedListNode t2 = head2;
        
        while(t1 != null){
            
            list1.insertNode(t1.data);
            
            t1 = t1.next;
        }
        
        while(t2 != null){
            
            list2.insertNode(t2.data);
            
            t2 = t2.next;
        }
        
        if(list1.head.data > list2.tail.data){
            
            SinglyLinkedListNode curNode = head2;
            
            while(curNode != null){
                
                list.insertNode(curNode.data);
                
                curNode = curNode.next;
            }
            
            curNode = head1;
            
            while(curNode != null){
                
                list.insertNode(curNode.data);
                
                curNode = curNode.next;
            }
            
            return list.head;
            
        }
        
        else if(list1.head.data >= list2.head.data || list1.head.data <= list2.head.data) {
        	
        	SinglyLinkedListNode curNode1 = head1;
        	
        	SinglyLinkedListNode curNode2 = head2;
        	
        	while(curNode1 != null && curNode2 != null) {
        		
        		if(curNode1.data < curNode2.data) {
        			
        			list.insertNode(curNode1.data);
        			
        			curNode1 = curNode1.next;
        		}
        		
        		else if(curNode2.data < curNode1.data) {
        			
        			list.insertNode(curNode2.data);
        			
        			curNode2 = curNode2.next;
        		}
        		
        		else {
        			
        			list.insertNode(curNode1.data);
        			
        			list.insertNode(curNode2.data);
        			
        			curNode1 = curNode1.next;
        			
        			curNode2 = curNode2.next;
        		}
        	}
        	
        	if(curNode1 == null && curNode2 != null) {
        		
        		SinglyLinkedListNode t = curNode2;
        		
        		while(t != null) {
        			
        			list.insertNode(t.data);
        			
        			t = t.next;
        		}
        	}
        	
        	if(curNode1 != null && curNode2 == null) {
        		
        		SinglyLinkedListNode t = curNode1;
        		
        		while(t != null) {
        			
        			list.insertNode(t.data);
        			
        			t = t.next;
        		}
        	}
        	
        	return list.head;
        }
        else{
            
           SinglyLinkedListNode curNode = head1;
            
            while(curNode != null){
                
                list.insertNode(curNode.data);
                
                curNode = curNode.next;
            }
            
            curNode = head2;
            
            while(curNode != null){
                
                list.insertNode(curNode.data);
                
                curNode = curNode.next;
            }
            
            return list.head;
        }
        
        
        
		
		//return null;
		
	}
	
	public static void main(String [] args) {
		
		SinglyLinkedList list1 = new SinglyLinkedList();
		
		SinglyLinkedList list2 = new SinglyLinkedList();
		
		list1.insertNode(1);
		list1.insertNode(3);
		list1.insertNode(5);
		
		list2.insertNode(1);
		list2.insertNode(2);
		//list2.insertNode(4);
		
		SinglyLinkedListNode head = mergeLists(list1.head, list2.head);
		
		System.out.println("Head of big list -> " + head.data);
		
		while(head != null) {
			
			System.out.println(head.data);
			
			head = head.next;
		}
		
		
	}
	
	
	

}
