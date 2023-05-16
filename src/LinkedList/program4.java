package LinkedList;
class List{
	class Node{
		int data ; 
		Node next ;
		public Node(int data) {
			this.data = data ; 
			this.next = null ; 
		}
	}
	//Creating The Head And Tails Nodes For The Linked List
	public Node head = null ;
	public Node tail = null ;
	//Creating Method For Adding Nodes In The Linked List
	public void addNode(int data) {
		//Creating The New Node 
		Node newNode = new Node(data);
		//Checking If The List Is Empty 
		if(head == null) {
			head = newNode ;
			tail = newNode ;
		}
		else {
			tail.next = newNode ; 
			tail = newNode ;
		}
	}
		//Method For Iterating Through The List
		public void display() {
			Node current = head ; 
			if(head == null) {
				System.out.println("Linked List Is Empty");
				return ;
			}
			System.out.println("Nodes Of Linked List Are Below: ");
			while(current!=null) {
				System.out.print(current.data+" ");
				current = current.next ;
			}
		}
		//Method for Deleting The Head Node
		public void delHead() {
			//Checking If The List Is Empty
			if(head==null) {
				System.out.println("List Is Already Empty");
				return ;
			}
			else {
				if(head!=tail) {
					head = head.next ; 
				}
				else {
					head = tail = null ;
				}
			}
		}
}
public class program4 {
	//Deleting The First Node Or Head  Of The Linked List
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Creating The Object Of The List Class
		List obj = new List();
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		System.out.println("Before Deleting The Head Node");
		obj.display();
		System.out.println("After Deleting The Head Node");
		obj.delHead();
		obj.display();
}

}
