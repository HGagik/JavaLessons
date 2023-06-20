public class Space{
	 public static void main(String[] args) {
	String text = "Hello my friend";
	System.out.println(removeSpaces(text));

	 }

	 public static String removeSpaces(String text){
  	return text.replaceAll("\\s+","");
  	 
  }
	}