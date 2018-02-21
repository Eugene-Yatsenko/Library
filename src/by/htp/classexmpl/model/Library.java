package by.htp.classexmpl.model;

public class Library {
	
	private Book[] books;
	private int bookCount = 0;
	
	public Library() {
		
	}
	
    public void printAll() {
    	if(bookCount > 0) {
    		System.out.println("Our books:");
    		for (int i=0; i < bookCount; i++) {
    			books[i].printBook();
    		}
    	}else {
    		System.out.println("No books available");
    	}
    }
    
    public void addBook(Book book) {
    	if(this.books != null) {
			if(bookCount < books.length) {
				books[bookCount] = book;
				bookCount ++ ;
			} else {
				Book[] books = new Book[this.books.length +10];
				for(int i = 0; i < this.books.length; i++) {
					books[i] = this.books[i];
				}
				this.books = books;
				this.books[bookCount] = book;
				bookCount ++;	
			}
		} else {
			this.books = new Book[10];
			this.books[0] = book;
			bookCount ++;
		}
    }
    
	public void swapBooks(int a, int b) {
		Book tmp = new Book();
		tmp = this.books[a];
		this.books[a] = this.books[b];
		this.books[b] = tmp;
	}
    
	public void sortSelectionAsc() {	
		for (int min = 0; min < bookCount - 1; min++) {
				int least = min;
				for (int j= min + 1; j < bookCount; j++) {
					if (books[j].getYear() < books[least].getYear()) {
						least = j;
					}
				}
				swapBooks(least, min);			
			}
		}
	
	public void findByAuthor(String keyName, String keySurname) {
		System.out.println("Books by " + keyName + " " + keySurname);
		for (int i=0; i < bookCount; i++) {
			if( books[i].checkAuthor(keyName, keySurname))
			books[i].printBook();
		}
	}
	
	public void delByTitle(String keyTitle) {
		for (int i=0; i < bookCount; i++) {
			if( books[i].checkTitle(keyTitle)) {
				if(i < bookCount - 1 ) {
					swapBooks(i, bookCount - 1);
				}
				bookCount -- ;
			}
			
		}
	}
	
	

}
