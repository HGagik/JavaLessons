public class Book{
	private Person author;
	private String genre;

	public Book(Person author, String genre){
		this.author = author;
		this.genre = genre;
	}

	public Person getAuthor(){
		return author;
	}

	public String getGenre(){
		return genre;
	}
}