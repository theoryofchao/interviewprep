package hashTableExample;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args){
		/* Creating a HashTable
		 * -Is synchronized, therefore preferable over HashMap for threaded applications
		 * -Does not allow null keys or values
		 */
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		/* Creating a HashMap
		 * -Is not synchronized, better for non-threaded applications
		 * -Allows one null key and any number of null values
		 */
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Clears the Hash Table
		ht.clear();
		
		//Creates a "clone" of the Hash Table without the keys/values
		Hashtable clone = (Hashtable) ht.clone();	//Cast with Hashtable as clone returns as an object
		
		//Tests to see if some key maps to some specified value. Expensive as your trying to find values as opposed to using keys.
		ht.contains("Some value");
		
		//Checks is Hash Table is empty
		ht.isEmpty();
		
		//Returns the enumeration of the keys contained in the hash table
		ht.keys();
		
		//Maps specified key to the specified value in the hash table
		ht.put(1, "value");
		
		//Removes the key and it's corresponding value from the hash table
		ht.remove(1);
		
		//Returns an integer of the number of key-value mappings in the hash table.
		ht.size();
		
		//Returns a boolean which tests if the specified value is a key in the hash table
		ht.containsKey(1);
		
		//Returns a boolean to test the specified object is a value in the hash table or not
		ht.containsValue("value");
		
		//Returns an Enumeration of the values contained in the hash table
		ht.elements();
		
		//Returns the object to which the specified key is mapped. Null if no mapping exists.
		ht.get(1);
	}
}
