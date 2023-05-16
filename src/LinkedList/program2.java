package LinkedList;

//Defining The Class singlyLinkedList

class singlyLinkedList {
	//Again Defining The Class Node For Creating The Node
	class Node {
		int data ;
		Node next ;
		public Node(int data) {
			this.data = data ;
			this.next = null ;
		}
	}
	public Node head = null ; 
	public Node tail = null ;
	//Method For Adding The Nodes In The Linked List
	public void addNode(int data) {
		Node newNode = new Node(data) ;
		//Checking If The List Is Empty Or Not 
		if(head==null) {
			head = newNode ;
			tail = newNode ;
		}
		else {
			tail.next = newNode ;
			tail = newNode ;
		}
	}
	//Method For Displaying The Nodes Of The Linked List
	public void display() {
		//For Counting The Nodes In The Linked Lsit
		int count = 0 ;
		Node current  = head ;
		if(head == null) {
			System.out.println("List Is Empty");
		}
		else {
			System.out.println("Linked List Nodes Are Below : ");
			while(current!=null) {
				System.out.print(current.data+" ");
				count++ ;
				current = current.next ;
			}
			System.out.println();
			System.out.println("Total Nodes In The List Are : "+ count);
		}
	}
}

public class program2 {
	//Implementation Of The Singly Linked List
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlyLinkedList obj = new singlyLinkedList() ;
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		//Displaying The List Elements
		obj.display();
	}

}
