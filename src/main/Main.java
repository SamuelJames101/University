package main;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		MainProcessor processor = new MainProcessor();
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("pussy");
		list.add("moist");
		list.add("thrust");
		list.add("small child");
		
		try {
			processor.process(list.iterator());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
