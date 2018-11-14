package main;

//This is a class that takes a boolean and turns it into a string 
public class BooleanNode implements Node {
	public Boolean value;
	@Override
	public String describe() {
		return value ? "true" : "false";
	}
}