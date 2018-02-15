package practice.tree.binaryTree.q1_1;

import java.util.ArrayList;

public class MySolution
{
	public boolean isBinarySearchTree(Node root)
	{
		if (root == null) {
			return false;
		}

		ArrayList<Integer> inOrderTraversal = new ArrayList<>();
		inOrderTraversal(inOrderTraversal, root);
		return isSorted(inOrderTraversal);
	}

	private void inOrderTraversal(ArrayList result, Node root) {
		if (root == null) {
			return;
		}

		inOrderTraversal(result, root.left);
		result.add(root.value);
		inOrderTraversal(result, root.right);
	}

	private boolean isSorted(ArrayList<Integer> list){
		for (int i = 0 ; i < list.size() -1 ; i++) {
			if (list.get(i) > list.get(i + 1)) {
				return false;
			}
		}

		return true;
	}

	public boolean isBinarySearchTree2(Node root) {
		if (root == null) {
			return false;
		}

		return isBinariSearchTree2(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isBinariSearchTree2(Node root, int min, int max) {
		if (root == null) {
			return true;
		}

		int value = root.value;
		if (value < min || value > max) {
			return false;
		}

		return isBinariSearchTree2(root.left, min, value) && isBinariSearchTree2(root.right, value, max);

	}




}
