import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number = 1;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Undefined number");
			return;
		}
		
		for (int i=2; i<number; i++) {
			if(number%i==0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("number is prime : " + number);
		}else {
			System.out.println("number is not prime : " + number);
		}	
		
		//Is the number entered from outside a prime or not? 
		
		int enteredNumber;
		int counter=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		enteredNumber = scanner.nextInt();
		
		for (int i=2; i<enteredNumber; i++) {
			if(enteredNumber==2) {
				break;
			}else if (enteredNumber%i==0) {
				counter++;
				break;
			}
		}
		if (counter==0) {
			System.out.println("Number is prime : " + enteredNumber);
		}else {
			System.out.println("Number is not prime : " + enteredNumber);
		}
		
	}

}
