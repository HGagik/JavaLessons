public class Librarian extends Person{
	private String name;
	private String level;

	public Librarian(String name){
		super(name);
		this.name = name;
	}

	public Librarian(String name,String level){
		super(name);
		this.name = name;
		this.level = level;
	}

	public String getName(){
		return name;
	} 

	public String getLevel(){
		return level;
	}
}