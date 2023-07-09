public class Library{
	private Book[] books;
	private Person librarian;
	private int countOfBooks;

	public Library(Book[] books, Person librarian, int countOfBooks){
		this.books = books;
		this. librarian = librarian;
		this.countOfBooks = countOfBooks;
	}

	public Book[] getBooks(){
		return books;
	}

	public Person getLibrarian(){
		return librarian;
	}

	public int getCountOfBooks(){
		return countOfBooks;
	}
}