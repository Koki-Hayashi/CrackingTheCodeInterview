package q4_1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MySolution {

	private boolean findPathByDFSRecursive(Node from, Node to, Set<Integer> visitedIds){
		if(visitedIds.contains(from.id)) return false;

		if (from.id == to.id) {
			return true;
		}

		visitedIds.add(from.id);

		for (Node n : from.children) {
			if (findPathByDFSRecursive(n, to, visitedIds)) {
				return true;
			}
		}

		return false;

	}

	public boolean findPathByDFSRecursive(Node from, Node to) {
		if(from == null || from.children == null ||
				to == null || to.children == null) return false;

		return findPathByDFSRecursive(from, to, new HashSet<Integer>());
	}

	public boolean findPathByDFSStack(Node from, Node to){
		if(from == null || from.children == null ||
				to == null || to.children == null) return false;

		LinkedList<Node> stack = new LinkedList();
		Set<Integer> visitedIds = new HashSet<>();

		stack.push(from);

		while (!stack.isEmpty()) {
			Node n = stack.pop();

			if (visitedIds.contains(n.id)) continue;

			if(n.id == to.id) return true;

			visitedIds.add(n.id);
			for(int i = n.children.length -1 ; i >= 0 ; i--) {
				stack.push(n.children[i]);
			}
		}

		return false;
	}

	public boolean findPathByBFS(Node from, Node to){
		if(from == null || from.children == null ||
				to == null || to.children == null) return false;

		LinkedList<Node> queue = new LinkedList();
		Set<Integer> visitedIds = new HashSet<>();

		queue.add(from);

		while (!queue.isEmpty()) {
			Node n = queue.remove();

			if (visitedIds.contains(n.id)) continue;
			if(n.id == to.id) return true;

			visitedIds.add(n.id);
			for(Node c : n.children) {
				queue.add(c);
			}
		}

		return false;
	}


}