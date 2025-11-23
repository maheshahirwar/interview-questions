package reverse_linkedlist;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(30);
		head.next.next = new Node(50);
		head.next.next.next = new Node(60);
		head.next.next.next.next = new Node(80);

		printList(head);
		head = reverseLinkedList(head);
		printList(head);
	}

	private static Node reverseLinkedList(Node head) {
		Node prev = null, curr = head;

		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private static void printList(Node head) {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + ", ");
			node = node.next;
		}
		System.out.println();

	}

}
