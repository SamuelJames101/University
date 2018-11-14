package Interface;

import java.io.IOException;
import java.util.Iterator;

public interface Processor {
	//This makes sure each processor method ran in the classes gives returns no data, takes an iterator of type string called it and it can produce an error
	void process(Iterator<String> it) throws IOException;
}
