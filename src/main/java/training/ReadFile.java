package training;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new FileReader("allstar-2008_2009-input.txt"));
		String input;
		while((input = in.readLine()) != null)
		{
			process(input);
		}
		in.close();
	}

	private static void process(String input) {
		String result = "";		
		System.out.println("Input" + input);

		System.out.println("Result" + result);
	}
	}

