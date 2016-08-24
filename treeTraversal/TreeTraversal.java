package treeTraversal;

public class TreeTraversal {

	//In-Order Traversal: Visit the Left Subtree, then the Current Node, then the Right Subtree
	public static void inOrderTraversal(TreeNode<Integer> node){
		if(node!=null){
			inOrderTraversal(node.left);
			visit(node);
			inOrderTraversal(node.right);
		}
	}
	
	//Pre-Order Traversal: Visit the Current Node, then the Left Subtree, then the Right Subtree
	public static void preOrderTraversal(TreeNode<Integer> node){
		if(node!=null){
			visit(node);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	//Post-Order Traversal: Visit the Left Subtree, then the Right Subtree, then the Current Node
	public static void postOrderTraversal(TreeNode<Integer> node){
		if(node!=null){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			visit(node);
		}
	}

	//Interview Tip: Should define what visit means.
	private static void visit(TreeNode<Integer> node) {
		System.out.println(node.value);
		
	}

}
