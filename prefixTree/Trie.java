package prefixTree;

public class Trie {
	private TrieNode root;
	
	public Trie(){
		root = new TrieNode();
	}
	
	//Inserts a word into the Trie
	public void insert(String word){
		TrieNode currentNode = root;
		for(int i = 0; i<word.length(); i++){
			char letter = word.charAt(i);
			int index = letter - 'a';	//converts letter to index (0 for a, 1 for b, etc)
			if(currentNode.children[index]==null){	// 1. If the letter does not exist for the current node's children
				TrieNode temp = new TrieNode();		// 2. Create that Trie Node
				currentNode.children[index]=temp;	// 3. Assign that Trie Node to the current's children
				currentNode = temp;					// 4. Make current that node and move on to next character
			}
			else {
				currentNode=currentNode.children[index];	//If the letter does exist, then just move the current to that child
			}
		}
		currentNode.leaf=true;	//The current node is now the last node, set the boolean to indicate a leaf node is here	
	}
	
	//Returns if the word is in the Trie
	public boolean search(String word){
		TrieNode current = searchNode(word);
		if(current==null) {
			return false;
		}
		else {
			if(current.leaf) {
				return true;
			}
		}
		return false;
	}
	
	//Returns if there is any word in the Trie that starts with the String prefix
	public boolean startWith(String prefix){
		TrieNode current = searchNode(prefix);
		return current==null?false:true;
	}
	
	public TrieNode searchNode(String word){
		TrieNode currentNode = root;
		for(int i = 0; i<word.length(); i++) {
			char letter = word.charAt(i);
			int index = letter - 'a';
			if(currentNode.children[index]!=null){
				currentNode = currentNode.children[index];
			}
			else {
				return null;	//No such node exists, exits loop by returning null early
			}
		}
		
		if(currentNode == root){
			return null;
		}
		
		return currentNode;
	}
}
