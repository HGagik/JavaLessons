import java.util.*;
public class Main{
	public static void main(String[] args){

	final List<Integer> numbers = new ArrayList<> ();
	final List<String> names = new ArrayList<> ();


	numbers.add(8);
	numbers.add(9);
	numbers.add(15);
	numbers.add(1);
	numbers.add(1500);
	numbers.add(2000);

	names.add("Sara");
	names.add("Anna");
	names.add("Dina");
	names.add("Bella");
	names.add("Nonna");

	ListUtils listUtils = new ListUtils();

System.out.println(listUtils.countOfEvenNumbers(numbers));
System.out.println(listUtils.isSorted(numbers));
System.out.println(listUtils.sortNames(names));
System.out.println(listUtils.getUniqueNumbers(numbers));
System.out.println(listUtils.mappingNames(names));

	}
}