package by.htp.classexmpl.runner;

//import java.text.DateFormat;
import by.htp.classexmpl.model.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import by.htp.classexmpl.model.Author;
import by.htp.classexmpl.model.Book;

public class Runner {

	public static void main(String[] args) throws ParseException {

		Scanner in = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = df.parse("13-01-2001");
		Date date2 = df.parse("06-06-1903");
		
		String keyName = "Name3";
		String keySurname = "Sur3";
		String keyTitle = "Book1";
		
		boolean test;
		
		Library lib = new Library();
		
		Author auth1 = new Author("Name1", "Sur1", date1);
		Author auth2 = new Author("Name2", "Sur2", date1);
		Author auth3 = new Author("Name3", "Sur3", date1);
		Author auth4 = new Author("Name4", "Sur4", date1);
		Author auth5 = new Author("Name5", "Sur5", date1);
		
		Book book1 = new Book("Book1", 2006);
		Book book2 = new Book("Book2", 1950);
		Book book3 = new Book("Book3", 2017);
		
		Author[] authors = new Author[] {auth1, auth2, auth3};
		
		book1.setAuthors(authors);
		
		book2.addAuthor(auth3);
		book2.addAuthor(auth4);
		
		book3.addAuthor(auth2);
    	book3.addAuthor(auth3);
		
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		
		lib.printAll();
		lib.sortSelectionAsc();
		lib.printAll();
		
//		keyName = in.nextLine();
//		keySurname = in.nextLine();
		
		test = book1.checkAuthor(keyName, keySurname);
		
		lib.findByAuthor(keyName, keySurname);
		lib.delByTitle(keyTitle);
		lib.printAll();
		
	}

}
