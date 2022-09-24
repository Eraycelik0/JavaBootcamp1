import java.util.Scanner;

public class Main {
	
	public static void gretting() {
		System.out.println("Hello. How are you ? ");
		System.out.println("Hi...");
	}

	
	public static void factorial() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A number : ");
		int number = scanner.nextInt();
		
		int factorial = 1;
		
		while (number > 0) {
			factorial *= number;
			
			number--;
		}
		System.out.println("Factorial : " + factorial);
	}
	public static void main(String[] args) {
		/* Access specifier(optional) extra features Return Type function Name(parameters)
		 * {
		 * This is the function block
		 * 
		 * the operations of the function will be here
		 * }
		 */
		
		gretting();
		
		factorial();

	}

}
