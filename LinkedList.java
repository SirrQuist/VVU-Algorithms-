

public class LinkedList {

	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}


	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;

			}

			node.next = n.next;
			n.next = node;
		}


	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;

			n1 = null;
		}
	}


	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public class Node {
		int data;
		Node next;     //next is a reference to subsequent nodes//


	}

	


public static class list {

	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}


	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;

			}

			node.next = n.next;
			n.next = node;
		}


	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;

			n1 = null;
		}
	}


	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public class Node {
		int data;
		Node next;     //next is a reference to subsequent nodes//


	}


		public static void main(String[] args) {

			LinkedList list = new LinkedList();

			//insertion of initial values
			list.insert(8);
			list.insert(10);
			list.insert(12);
			list.insert(16);
			list.insert(9);
			list.insert(14);
			System.out.println("List of initial values");
			list.show();
			System.out.println("\nInsert 15 at start");
			list.insertAtStart(15);
			list.show();
			
			System.out.println("\nInsert 25 at index 5");
			list.insertAt(5, 25);
			list.show();
			
			System.out.println("\nInsert 30 at index 3");
			list.insertAt(3, 30);
			list.show();
			
			System.out.println("\nDelete value at index 1");
			list.deleteAt(1);
			list.show();

		}

	}


}
