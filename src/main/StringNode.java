package main;

public class StringNode implements Node{
	public String value;
	
	@Override
	public String describe() {
		return "\"" + value + "\"";
	}

}
