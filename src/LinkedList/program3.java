package LinkedList;
class linkedList{
	
	class Node{
		int data ; 
		Node next ;
		public Node (int data) {
			this.data = data ; 
			this.next = null ;
		}
	}
	public Node head = null ;
	public Node tail = null ;
	//Method For Adding The Node In The List
	public void  addNode (int data) {
		//Calling The Constructor Of The Class Node
		Node newNode = new Node(data);
		//Checking Whether The List Is Empty Or Not
		if(head==null) {
			head = newNode ;
			tail = newNode ;
		}
		else {
			tail.next = newNode ;
			tail = newNode ;
		}
	}
	//Method For Printing The All Nodes Of The List 
	public void display() {
		Node current = head ; 
		//Checking Whether The List Is Empty
		if(head == null) {
			System.out.println("List Is Empty");
		}
		//Iterating Through The List
		else {
			while(current!=null) {
				System.out.print(current.data+" ");
				current = current.next ;
			}
		}
	}
	//Method For Displaying The Nodes Of The List In The Reverse Order
	public void reverse_display(Node current) {
		if(head == null) {
			System.out.println("List Is Empty");
			return;
		}
		else {
			if(current.next == null) {
				
				System.out.print(current.data+" ");
				return;
			}
			//Recursive Call
			reverse_display(current.next);
			System.out.print(current.data+" ");
		}
	}
}
public class program3 {
	//Implementation Of The Linked List
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Creating The Object The Class linkedList
		linkedList obj = new linkedList();
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		System.out.println("Nodes In Exact Order In The List Are: ");
		obj.display();
		System.out.println();
		System.out.println("Nodes In The Reverse Order In The List Are: ");
		obj.reverse_display(obj.head);
	}

}
