import java.util.*;
public class ListUtils{


	
public int countOfEvenNumbers(final List<Integer> numbers){
	int count = 0;
	for(int i = 0; i < numbers.size();i++){
		
			if (numbers.get(i) % 2 == 0){
			count++;	
		}	

	}
	return count;
}


public boolean isSorted(final List<Integer> numbers){

	boolean isSorted = true;	
	  for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < numbers.get(i-1)) {
                return false;
            }
        }
        return isSorted;    
	
}

public List<String> sortNames (final List<String> names){
	Collections.sort(names);
	return names;
}

public List<Integer> getUniqueNumbers(final List<Integer> numbers){
	final Set<Integer> uniqueNumbers = new HashSet<Integer>();

	for(int number:numbers){
		uniqueNumbers.add(number);
	} 

	final List<Integer> result = new ArrayList<Integer>();

	for(int number:uniqueNumbers){
		result.add(number);
	} 
	return result;
}

public Map<Integer,String> mappingNames(final List<String> names){
	final Map<Integer,String> mapOfNames = new HashMap<>();
	for(int i = 0; i <names.size(); i++){
		mapOfNames.put(i +1,names.get(i));
	}
	return mapOfNames;
}
}