package practice.linkedList.q1_1;

public class MySolution
{
	public void insert(Node head, Node newNode)
	{
		if (head == null) {
			throw new IllegalArgumentException("head shouldn't be null");
		}

		if (head.value > newNode.value) {
			insertBeforeHead(head, newNode);
		} else {
			insertBetween(head, newNode);
		}
	}

	private void insertBeforeHead(Node head, Node newNode){
		Node current = head;

		while (current.next != head) {
			current = current.next;
		}

		newNode.next = head;
		current.next = newNode;
	}

	private void insertBetween(Node head, Node newNode) {
		Node current = head;

		while(current.next.value < newNode.value && current.next.value != head.value) {
			current = current.next; // assume any node of given circular list doesn't have next = null
		}

		newNode.next = current.next;
		current.next = newNode;

	}

	public String traversal(Node head){
		StringBuilder sb = new StringBuilder();
		sb.append(head.value + " ");
		Node current = head.next;

		while(current != head) {
			sb.append(current.value + " ");
			current = current.next;
		}

		return sb.toString().trim();
	}

}
