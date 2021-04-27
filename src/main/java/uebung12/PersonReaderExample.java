package uebung12;

import java.util.List;

/**
 * @author dgrether
 *
 */
public class PersonReaderExample {

	private static void printPersonsList(List<Person> persons){
		for (Person p : persons){
			System.out.println("Person Id: " + p.getId());
			System.out.println("  Name: " + p.getName());
			System.out.println("  Vornamen: ");
			for (String s : p.getVornamen()){//数组里套数组
				System.out.println("    " + s);
			}
			System.out.println("  Alter " + p.getAlter());
		}
	}
	
	public static void main(String[] args) {

/*		// Aufgabe 1a) Understand how the PersonsCSVReaderWorks
		System.out.println();//换行
		System.out.println("csv persons reader: ");
		String personsCsvFile = "src/main/java/uebung12/data/persons.csv";
		PersonsCSVReader csvParser = new PersonsCSVReader();
		List<Person> personsCsv = csvParser.readFile(personsCsvFile);
		printPersonsList(personsCsv);*/


		// Aufgabe 1b) Understand how the PersonsXmlReader works
		String personsXmlFile = "src/main/java/uebung12/data/persons.xml";
		PersonsXmlReader xmlParser = new PersonsXmlReader();
		List<Person> personsXml = xmlParser.readFile(personsXmlFile);
		System.out.println();//换行
		System.out.println("xml persons reader: ");
		printPersonsList(personsXml);

	}

}
