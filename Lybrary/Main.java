public class Main{
	public static void main (String[] args){
		Person librarian = new Librarian("Libi","Expert");
		Person author = new Author("Arthur",7,"Comedy");
		Book book1 = new Book(author,"Comedy");
		Book book2 = new Book(author,"Comedy");
		Book[] books = {book1,book2};
		Library library = new Library(books,librarian,1000);

		

		System.out.println(library.getCountOfBooks());
	}
}