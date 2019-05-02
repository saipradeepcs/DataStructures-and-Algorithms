package trees;

import java.util.*;

class Node{
	int data;
	Node left, right;
	public Node(int x){
		data =x;
		left=null;
		right=null;
	}
}

public class ReverseLevelOrderTraversal {

public static void main(String[] args) {
	Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(7);
	root.left.left.left = new Node(10);
	root.left.left.left.left = new Node(18);
	root.left.right = new Node(6);
	root.left.right.left = new Node(11);
	root.right.left = new Node(5);
	root.right.right = new Node(4);
	root.right.right.right = new Node(12);
	reverseLevelOrderTraversal(root);
}

public static void reverseLevelOrderTraversal(Node root) {
	if(root == null) {
		return;
	}
	Stack<Node> s = new Stack<Node>();
	Queue<Node> q = new LinkedList<Node>();
	q.offer(root);
	while(!q.isEmpty()) {
		Node curr = q.poll();
		s.push(curr);
		if(curr.right != null)
			q.offer(curr.right);
		if(curr.left != null)
			q.offer(curr.left);
	}
	while(!s.empty()) {
		Node curr = s.pop();
		System.out.print(curr.data+" ");
	}
}
public static void reverseLevelOrderTraversalSpiralForm(Node root) {
	if(root == null) {
		return;
	}
	Stack<Node> s = new Stack<Node>();
	Queue<Node> q = new LinkedList<Node>();
	
	
}
}
