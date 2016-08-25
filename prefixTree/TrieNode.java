package prefixTree;

public class TrieNode {
	TrieNode[] children;
	boolean leaf;
	
	public TrieNode(){
		this.children = new TrieNode[26];	//For a to z, use 128 or 256 for ASCII/Extended ASCII
	}
}
