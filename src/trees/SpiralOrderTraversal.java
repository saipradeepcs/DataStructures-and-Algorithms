package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


//class Node{
//	int data;
//	Node left, right;
//	public Node(int item) {
//		data=item;
//		this.left=null;
//		this.right=null;
//	}
//}
class SpiralOrderTraversal {
	Node root;
	//	SpiralOrderTraversal() {
	//		root = null;
	//	}

	public static void main(String[] args) {
		SpiralOrderTraversal tree = new SpiralOrderTraversal();
		//		tree.root = new Node(10);
		//		tree.root.left = new Node(3);
		//		tree.root.right = new Node(8);
		//		tree.root.left.left = new Node(9);
		//		tree.root.left.right = new Node(12);
		//		tree.root.right.left = new Node(7);
		//		tree.root.left.left.left = new Node(18);
		//		tree.spiralOrderTraversal(tree.root, true);
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
		spiralOrderTraversal(root);
	}

	public static void spiralOrderTraversal(Node node) {
//		if(root == null) {
//			return;
//		}
//		Queue<Node> q = new LinkedList<Node>();
//
//		q.add(root);
//		
//		while(q.size()>0) {
//			int size = q.size();
//			Node curr=null;
//			if(!rtl) {
//				boolean flag = true;
//				for(int i=0; i< size; i++) {
//					if(flag) {
//						Node temp = q.poll();
//						curr = q.poll();
//						if(temp != null) {
//							System.out.print(temp.data + " ");
//							if(curr != null) {
//								System.out.print(curr.data+" ");
//								if(curr.left !=null)
//									q.offer(curr.left);
//								if(curr.right != null)
//									q.offer(curr.right);
//							}
//							if(temp.left != null)
//								q.offer(temp.left);
//							if(temp.right != null)
//								q.offer(temp.right);
//							flag= false;
//						}
//					}
//				}
//				rtl=true;
//			}
//			if(rtl) {
//				boolean flag = true;
//				for(int i=0; i< size; i++) {
//					if(flag) {
//						curr = q.poll();
//						if(curr!=null && flag) {
//							System.out.print(curr.data+" ");
//							if(curr.right != null)
//								q.add(curr.right);
//							if(curr.left != null)
//								q.add(curr.left);
//						}
//					}
//				}
//				flag = false;
//				rtl=false;
//
//			}
//		}
		if(node == null){
            return;
        }
        Stack<Node> s = new Stack<Node>();
        Queue<Node> q = new LinkedList<Node>();
        q.offer(node);
        boolean reverse = true;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i< size; i++) {
            	Node curr = q.poll();
            	if(reverse) {
            		s.push(curr);
            	}else {
            		System.out.print(curr.data+" ");
            	}
            	 if(curr.left != null){
                     q.offer(curr.left);
                 }
                 if(curr.right != null){
                     q.offer(curr.right);
                 } 
            }
            
            if(reverse){
                while(!s.empty()){
                    Node curr = s.pop();
                    System.out.print(curr.data+" ");
                }
            }
            reverse = !reverse;
        }
        
        
   }
//	Solution using 2 stacks
	void printSpiral(Node node) 
    {
         if(node == null){
             return;
         }
         Stack<Node> s1 = new Stack<Node>();
         Stack<Node> s2 = new Stack<Node>();
         s1.push(node);
         while(!s1.empty() || !s2.empty()){
             
             while(!s1.empty()){
                 Node curr = s1.pop();
                 System.out.print(curr.data+" ");
                 if(curr.right != null){
                     s2.push(curr.right);
                 }
                 if(curr.left != null){
                     s2.push(curr.left);
                 }
             }
             while(!s2.empty()){
                 Node curr = s2.pop();
                 System.out.print(curr.data+" ");
                 if(curr.left != null){
                     s1.push(curr.left);
                 }
                 if(curr.right != null){
                     s1.push(curr.right);
                 }
             }
         }
    }
}
