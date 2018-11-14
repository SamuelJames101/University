package main;

public class NumberNode implements Node{
	public float value;
	@Override
	public String describe() {
		//This calls the string class and its valueOf method passing in our variable number and therfore converting it to a string
		return String.valueOf(value);
	}

}
