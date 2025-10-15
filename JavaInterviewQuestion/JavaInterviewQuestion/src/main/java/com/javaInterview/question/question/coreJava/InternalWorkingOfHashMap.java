package com.javaInterview.question.question.coreJava;

public class InternalWorkingOfHashMap {

	
	
}

/*

	Internal working of HashMap
	
	HashMap in Java is a key-value pair data structure based on hashing.
	It allows one null key and multiple null values.
	Order is not guaranteed (use LinkedHashMap if order matters).
	It is not thread-safe (use ConcurrentHashMap in multithreading).
	
	HashMap in Java uses an array of buckets. Each key is converted into a hash using the hashCode() method, 
	then mapped to a bucket index. 
	If the bucket is empty, the entry is placed there. If not, it handles collisions using a linked list or, 
	after Java 8, a Red-Black Tree when the bucket becomes too large. During retrieval, 
	the same hash function is used to find the bucket, and then keys are compared using equals() to return the correct value. 
	HashMap also resizes itself when the load factor exceeds 0.75.
	
	Step 1 -  
	HashMap stores key-value pairs.
	Internally, it uses an array of buckets (called Node<K,V>[] table).
	Each bucket can hold a linked list (before Java 8) or a balanced tree (after Java 8, if many collisions occur).
	
	Step 2 - 
	map.put(101, "Kishan");
		1. Calculate hash
		Every key’s hashCode() method is called.
		Then a hash function is applied
		
		int hash = hash(key.hashCode());
		int bucketIndex = hash % capacity;
		This gives the index of the bucket in the array.
		
		2. Check bucket
		If the bucket is empty → create a new node and place it there.
		If not empty → compare keys:
			If the same key exists → update value.
			If different key with same hash (collision) → add to LinkedList / TreeNode.
		
		3. Collision Handling
		Before Java 8 → collisions are handled using a LinkedList.
		After Java 8 → if more than 8 nodes in the same bucket, it converts to a balanced tree (Red-Black Tree) for faster lookup.
		
	Step 3 - 
	Steps of Retrieval (get() method)
		map.get(101);
		1. Calculate hash and find bucket index.
		2. Traverse bucket
			If only one node → return directly.
			If multiple (collision) → compare keys using equals().
		3. Return value if key matches.
		
	Step 4 - 
	Resize / Rehashing
		1. Default capacity = 16, Load factor = 0.75.
		2. When size > capacity * loadFactor → HashMap doubles its size.
		3. All existing entries are rehashed into new buckets.
		
	Step 5 - 
	Diagram in Words
		map.put(1, "One");
		map.put(2, "Two");
		map.put(17, "Seventeen");
	1. Keys 1 and 17 both hash to bucket index 1 (collision).
	2. So bucket[1] → LinkedList → [ (1, "One") → (17, "Seventeen") ]
	3. Key 2 goes to bucket[2].
		
	
	----------  Internal working of Map -----
	Map is an interface in Java that represents a collection of key-value pairs. 
	Its internal working depends on its implementation:
		HashMap uses hashing and buckets.
		LinkedHashMap uses a HashMap + linked list to maintain order.
		TreeMap uses a Red-Black Tree for sorting.
		ConcurrentHashMap ensures thread safety with fine-grained locking.
		Generally, when you call put(), Java calculates the hash of the key, finds the appropriate bucket or node 
		(based on structure), and stores the entry. If the key already exists, the value is replaced. 
		Lookup is O(1) in HashMap, O(log n) in TreeMap, and O(1) with ordering in LinkedHashMap.


*/