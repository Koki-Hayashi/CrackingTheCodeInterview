package practice.linkedList.q1_2;

public class MySolution
{
	public Node merge(Node a, Node b) {
		if (a == null && b == null) {
			throw new IllegalArgumentException();
		}

		Node head = new Node();
		Node current = head;

		while (a != null && b!= null) {
			int valueA = a.value;
			int valueB = b.value;

			if (valueA < valueB) {
				current.next = a;
				a = a.next;
			} else {
				current.next = b;
				b = b.next;
			}

			current = current.next;
		}

		while (a != null) {
			current.next = a;
			a = a.next;
			current = current.next;
		}

		while (b != null) {
			current.next = b;
			b = b.next;
			current = current.next;
		}

		return head.next;
	}

	public String traversal(Node head){
		StringBuilder sb = new StringBuilder();

		while(head != null) {
			sb.append(head.value + " ");
			head = head.next;
		}

		return sb.toString().trim();
	}
}
