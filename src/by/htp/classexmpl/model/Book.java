package by.htp.classexmpl.model;

public class Book {
	String title;
	int year;
	private int authorCounter;
	private Author[] authors;
		
	public Book() {
		
	}
	
	public Book(String title, int year) {
		this.title = title;
		this.year = year;
		
	}
	
	public void printBook() {
		System.out.println(this.getTitle());
		System.out.println(this.getYear());
		for (int i = 0; i < this.authors.length; i++) {
			if(this.authors[i] != null){
				authors[i].printAuthorName();
			}
		}
		System.out.println();
		System.out.println("=============================");
		
	}
	
	public boolean checkAuthor(String keyName, String keySurname) {
		boolean flag = false;
		for (int j = 0; j < authorCounter; j++) {
			if(this.authors[j].surname == keySurname && this.authors[j].name == keyName ){
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean checkTitle(String keyTitle) {
		if (this.getTitle() == keyTitle) {
			return true;
		} else {
			return false;
			}
	}
	
	public void setAuthors (Author[] authors){
		if (authors != null) {
			this.authors = authors;
			this.authorCounter = authors.length;
		}
	}
	
	public Author[] getAuthors (){
		return this.authors;	
	}
	
	public void addAuthor(Author author) {
		if(this.authors != null) {
			if(authorCounter < authors.length) {
				authors[authorCounter] = author;
				authorCounter ++ ;
			} else {
				Author[] authors = new Author[this.authors.length +10];
				for(int i = 0; i < this.authors.length; i++) {
					authors[i] = this.authors[i];
				}
				this.authors = authors;
				this.authors[authorCounter] = author;
				authorCounter++;	
			}
		} else {
			this.authors = new Author[10];
			this.authors[0] = author;
			authorCounter ++;
		}
	}
	
	public void setTitle (String title){
		if (title != null) {
			this.title = title;
		}	
	}
	
	public String getTitle (){
		return this.title;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void getYear(int year) {
		 this.year = year;
	}
}
