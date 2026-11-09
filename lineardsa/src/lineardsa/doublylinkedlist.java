//  implement double linked list and add in sorted mannner;

import java.utils.*;


class doublylinkedlist {
	
	class Node {
	    int data;
	    Node next;
	    Node previous;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.previous = null;
	    }
	}
	
    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void addSorted(Node dummy) {

        // Case 1: List is empty
        if (isEmpty()) {
            head = tail = dummy;
            return;
        }

        Node curr = head;

        // Case 2: Insert at the beginning
        if (dummy.data <= head.data) {
            dummy.next = head;
            head.previous = dummy;
            head = dummy;
            return;
        }

        // Find the correct position
        while (curr.next != null &&
               curr.next.data < dummy.data) {
            curr = curr.next;
        }

        // Case 3: Insert at the end
        if (curr == tail) {
            curr.next = dummy;
            dummy.previous = curr;
            tail = dummy;
        }

        // Case 4: Insert in the middle
        else {
            dummy.next = curr.next;
            dummy.previous = curr;

            curr.next.previous = dummy;
            curr.next = dummy;
        }
    }

    public void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        doublylinkedlist list = new doublylinkedlist();

        list.addSorted(new Node(30));
        list.addSorted(new Node(10));
        list.addSorted(new Node(40));
        list.addSorted(new Node(20));

        list.display();
    }





}