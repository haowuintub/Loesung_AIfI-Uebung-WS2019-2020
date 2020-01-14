package uebung12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileReaderWriter {

	public static void main(String[] args) {
		File inputFile = new File("inputFile.txt"); // Insert Path to Input File Here!
		File outputFile = new File("outputFile.txt"); // Insert Path to Output File Here!

		try (
			// note resources in round brackets, not curly!
			BufferedReader in = new BufferedReader(new FileReader(inputFile));
			BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
		) {

			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
