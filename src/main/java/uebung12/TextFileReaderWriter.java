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
		File inputFile = new File("src/main/java/uebung12/data/nagelBio.txt"); // Insert Path to Input File Here!
		File outputFile = new File("src/main/java/uebung12/data/nagelBiocopy.txt"); // Insert Path to Output File Here!

		try (
				// note resources in round brackets, not curly!
			BufferedReader in = new BufferedReader(new FileReader(inputFile));
			BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
		) {

			int bioCount = 0;
			String line;
			while ((line = in.readLine()) != null) {

				if (line.contains("===")) {
					bioCount++;
					line = "*********** Dr. Nagels Bio #" + bioCount + " ****************";
				}

				out.write(line + "\n");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
