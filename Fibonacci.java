public class Fibonacci{
	 public static void main(String[] args) {
	int number = 5;
	int [] numbers = fiboacciNumbers(number);
	for(int i = 0;i < numbers.length-1; i++){
		System.out.print(numbers[i] + ",");
	}
	System.out.print(numbers[numbers.length-1]);

	 }

	 public static int[] fiboacciNumbers(int number){
	 	int [] emptyArray = new int [0];
	 	if (number > 0){
  	int [] numbers = new int [number];
  	
  	numbers[0] = 1;
  	for(int i = 1;i<number-1;i++){
  		numbers[1]= numbers[0];
  		numbers[i +1] = numbers[i] + numbers[i-1]; 
  	
  }
  return numbers;
}
else{
	System.out.println("Provide possitive number");
    return emptyArray;
} 

	}  
		}
