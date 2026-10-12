package lineardsa;

class Node{
	int data;
	Node next;
	Node(int d){
		
		data = d;
		next = null;
		
	}
}

public class circularlikedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.next = new Node (20);
		n.next.next = new Node(30);
		
		

	}

}
