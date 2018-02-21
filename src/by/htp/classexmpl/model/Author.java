package by.htp.classexmpl.model;

import java.util.Date;

public class Author {
	String name;
	String surname;
	Date birthDate;
	
	public Author() {
		
	}
	
	public Author(String name, String surname, Date birthDate) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}
	
	public void printAuthorName() {
		System.out.print(this.name + " ");
		System.out.print(this.surname + "; ");
	}
}
