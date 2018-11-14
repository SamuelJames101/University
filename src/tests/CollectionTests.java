package tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.BooleanNode;
import main.NodeCollection;
import main.NullNode;
import main.NumberNode;
import main.StringNode;

public class CollectionTests {
	@Test
	void collectionTest() {
		NodeCollection nodeCollection = new NodeCollection();
		
		StringNode x = new StringNode();
		x.value = "test";
		
		BooleanNode y = new BooleanNode();
		y.value = true;
		
		NumberNode z = new NumberNode();
		z.value = 5.5f;
		
		NullNode s = new NullNode();
		
		nodeCollection.add(x);
		nodeCollection.add(y);
		nodeCollection.add(z);
		nodeCollection.add(s);
		
		System.out.println(nodeCollection.describe());
		
		assertEquals("[ \"test\", true, 5.5, null ]", nodeCollection.describe());
	}

}
