package main;

import java.io.IOException;
import java.util.Iterator;

import Interface.Processor;

public class MainProcessor implements Processor{
	private NodeCollection  nodeCollection;

	//This method works out if there is an item next in the array and if there is then it'll check to see if it is a string
	@Override
	public void process(Iterator<String> it) throws IOException {
		while (it.hasNext()) {
			String string = it.next().toLowerCase();
			if ((string.charAt(0) == '"') && (string.charAt(string.length() - 1) == '"')){
				StringNode stringNode = new StringNode();
				stringNode.value = string.substring(1,string.length()-1);
				nodeCollection.add(stringNode);

			} else if (string.matches("-?\\d+(\\.\\d+)?")){
				//Creating a new object called node inside of NumberNode class and making the paramter value the same as the string
				NumberNode numberNode = new NumberNode();
				numberNode.value = Float.parseFloat(string);
				//We then add the object to the nodeCollection
				nodeCollection.add(numberNode);
				
			} else if (("true".equals(string)) || ("false".equals(string))) {
				//Creating a new object called node inside of NumberNode class and making the paramter value the same as the string
				BooleanNode booleanNode = new BooleanNode();
				booleanNode.value = Boolean.parseBoolean(string);
				//We then add the object to the nodeCollection
				nodeCollection.add(booleanNode);
				
			} else if ("null".equals(string)) {
				NullNode nullNode = new NullNode();
				nodeCollection.add(nullNode);
			} else {
				throw new IOException("No valid nodes found!");
			}
		}
	}
	public MainProcessor() {
		nodeCollection = new NodeCollection();
	}
	
	public String describeNodeCollection() {
		return nodeCollection.describe();
	}
}
