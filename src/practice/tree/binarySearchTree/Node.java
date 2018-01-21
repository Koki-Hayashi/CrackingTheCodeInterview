package practice.tree.binarySearchTree;

public class Node
{
	int value;
	Node left = null;
	Node right = null;

	public Node()
	{
	}

	public Node(int value)
	{
		this.value = value;
	}

	public Node(int value, Node left, Node right)
	{
		this.value = value;
		this.left = left;
		this.right = right;
	}
}