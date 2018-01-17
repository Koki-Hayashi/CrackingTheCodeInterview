package practice.tree.binarySearchTree;

public class MySolution
{
	public Node buildUpBinarySearchTree(int[] array)
	{
		if (array.length < 2)
		{
			return new Node();
		}

		Node head = new Node();
		head.value = array[0];

		Node cur = head;
		for (int i = 1; i < array.length; i++)
		{
			int nextValue = array[i];

			while (true)
			{
				if (cur.value > nextValue)
				{

					if (cur.left == null)
					{
						cur.left = new Node(nextValue);
						break;
					}
					else
					{
						cur = cur.left;
					}
				}
				else
				{
					if (cur.right == null)
					{
						cur.right = new Node(nextValue);
						break;
					}
					else
					{
						cur = cur.right;
					}
				}
			}
			cur = head;
		}

		return head;
	}

	public void inorderTraversal(Node head)
	{
		if (head == null) {
			return;
		}

		inorderTraversal(head.left);
		System.out.println(head.value);
		inorderTraversal(head.right);

	}

	public Node search(Node head, int value) {
		if (head.value == value) {
			return head;
		}

		if (head.value > value && head.left != null) {
			return search(head.left, value);
		} else if (head.value < value && head.right != null) {
			return search(head.right, value);
		}

		return null;
	}

}
