package graphSearch;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import treeTraversal.TreeNode;

public class GraphSearch {

	/*
	 * Visit a node and iterate through its neighbors. 
	 * When visiting a node, we visit its neighbor, then its neighbor's neighbor, etc.
	 * Pre-order and other tree traversals are DFS.
	 * To prevent infinite loop, check if node has been visited(A Hash Map is used for that purpose here)
	 */
	public static <T> void dfsSearch(GraphNode<T> node, HashMap<GraphNode<T>, Boolean> nodesVisited){
		if(node == null){
			return;
		}
		visit(node);
		
		nodesVisited.put(node, true);
		
		for(GraphNode<T> adjacentNode: node.adjacentNodes){
			if(!nodesVisited.containsKey(adjacentNode)){
				dfsSearch(adjacentNode, nodesVisited);
			}
		}
	}
	
	/*
	 * BFS is ITERATIVE.
	 * Visit ALL of a node's neighbors. Then it moves on to it's neighbors neighbors.
	 * Using a Queue is the easiest for this solution.
	 */
	public static <T> void bfsSearch(GraphNode<T> node){
		HashMap<GraphNode<T>, Boolean> nodesVisited = new HashMap<GraphNode<T>, Boolean>();
		Queue<GraphNode<T>> queue = new LinkedList();
		nodesVisited.put(node, true);
		queue.add(node);
		
		while(!queue.isEmpty()){
			GraphNode<T> current = queue.poll();	//Remove from front of the queue (poll == dequeue)
			visit(current);
			for(GraphNode<T> adjacentNode: current.adjacentNodes){
				if(!nodesVisited.containsKey(adjacentNode)){
					nodesVisited.put(adjacentNode, true);
					queue.add(adjacentNode);
				}
			}
		}
	}
	
	
	//Interview Tip: Should define what visit means.
		private static <T> void visit(GraphNode<T> node) {
			System.out.println(node.value);
			
		}
}
