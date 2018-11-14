package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.BooleanNode;
import main.NullNode;
import main.NumberNode;
import main.StringNode;

class NodeTests {

	@Test
	void stringTest() {
		StringNode node = new StringNode();
		node.value = "Monkey";
		assertEquals("\"Monkey\"", node.describe());
	}
	
	@Test
	void booleanTest() {
		BooleanNode node = new BooleanNode();
		node.value = true;
		assertEquals("true", node.describe());
		
		node.value = false;
		assertEquals("false", node.describe());
	}
	
	@Test
	void numberTest() {
		NumberNode node = new NumberNode();
		node.value = 5.5f;
		assertEquals("5.5", node.describe());
	}
	
	@Test
	void nullTest() {
		NullNode node = new NullNode();
		assertEquals("null", node.describe());
		
	}
	
}
