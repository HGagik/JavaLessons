public class Author extends Person{
	private String name;
	private int countOfWrttenBooks;
	private String genre;

	public Author(String name){
		super(name);
		this.name = name;
	}

	public Author(String name, String genre){
		super(name);
		this.name = name;
		this.genre = genre;
	}

	public Author(String name, int countOfWrttenBooks,String genre){
		super(name);
		this.name = name;
		this.countOfWrttenBooks = countOfWrttenBooks;
		this.genre = genre;
	}

	public String getName(){
		return name;
	} 

	public int getCountOfWrttenBooks(){
		return countOfWrttenBooks;
	}

	public String getGenre(){
		return genre;
	}
}