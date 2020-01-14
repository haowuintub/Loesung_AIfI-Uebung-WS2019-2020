package uebung12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dgrether
 */
class Person {

	private String id;
	private String name;
	private List<String> vornamen;
	private int alter;
	
	Person(String id){
		this.id = id;
		this.vornamen = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	List<String> getVornamen() {
		return vornamen;
	}
	void addVorname(String vorname) {
		this.vornamen.add(vorname);
	}
	int getAlter() {
		return alter;
	}
	void setAlter(int alter) {
		this.alter = alter;
	}
	public String getId() {
		return id;
	}
	
}

