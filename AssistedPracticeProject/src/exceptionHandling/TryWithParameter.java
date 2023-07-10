package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithParameter {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:/Users/123/Downloads/Eclipse/Output.txt");
		
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.print("Hello, today is Friday");
		
		printWriter.close();
	}
}
