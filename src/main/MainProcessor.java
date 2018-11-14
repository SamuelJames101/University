package main;

import java.io.IOException;
import java.util.Iterator;

import Interface.Processor;

public class MainProcessor implements Processor{

	//This method works out if there is an item next in the array and if there is then it'll check to see if it is a string
	@Override
	public void process(Iterator<String> it) throws IOException {
		while (it.hasNext()) {
			String string = it.next();
			if ((string.charAt(0) == '"') && (string.charAt(string.length() - 1) == '"')){
				System.out.println("Is String!");
				
			}
		}
	}

}
