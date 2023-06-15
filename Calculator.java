import java.util.Scanner;
public class Calculator{
	 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Provide first number");
  int firstNumber = sc.nextInt();

  System.out.println("Provide second number");

  int secondNumber = sc.nextInt();

  System.out.println("Provide mathematical sign");

  char sign = sc.next().charAt(0);

  switch(sign){
  case '+': System.out.println(firstNumber + secondNumber);
    break;

  case '-':  System.out.println(firstNumber - secondNumber);
    break;

  case '*': System.out.println(firstNumber * secondNumber);
    break;

  case '/':  System.out.println(firstNumber / secondNumber);
    break;

   default:System.out.println("Only +, -, *, / symbols are acceptable");
  }
  

}
 
 }