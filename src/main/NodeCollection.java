package main;

import java.util.ArrayList;

//This is a public class called NodeCollection that implements the methods from the interface node
public class NodeCollection implements Node {
	//This creates an ArrayList class that takes the type node and it is called collection
	private ArrayList<Node> collection;
//This is the describe method from the interface, which returns all of the items in the arrayList collection inside of square brackets seperated by a comma
	@Override
	public String describe() {
		String output = "[ ";
		
		for(int index = 0; index < collection.size(); index++) {
			Node node = collection.get(index);
			
			if (index == collection.size() -1 ) {
				output += node.describe();
			} else {
			output += node.describe()+ ", ";
			}
		}
		return output + " ]";
	}

//This creates a new object which is an arrayList which again takes Node as it's type
	public NodeCollection() {
		System.out.println("We have created a collection of items.");

		collection = new ArrayList<Node>();

	}
// This doesn't return any information but just adds a new node which is like a string, it's of type Node and passing node
	public void add(Node node) {
		collection.add(node);
	}
}