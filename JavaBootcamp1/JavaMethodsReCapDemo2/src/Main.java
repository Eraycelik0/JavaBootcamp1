import java.util.Scanner;

public class Main {
	public static int findEbob(int number1, int number2) {
		int ebob = 1;
		
		for (int i = 1; i<=number1 && i<=number2; i++) {
			if ((i%number1==0) && (i%number2==0) ){
				ebob=i;
			}	
		}
		return ebob;
	}
	public static void main(String[] args) {
		// find ebob

		Scanner scanner = new Scanner(System.in);
		System.out.println("First number : ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Second number : ");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Find ebob : " + findEbob(firstNumber, secondNumber));
		
	}

}
