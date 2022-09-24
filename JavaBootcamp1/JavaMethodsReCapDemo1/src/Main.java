
public class Main {
	public static boolean isPrime(int number) {
		for (int i=2; i<number; i++) {
			if (number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// Print prime numbers from 1 to 1000
		
		for (int i=2; i<1000; i++) {
			if(isPrime(i)) {
				System.out.println("Number is prime : " + i );
			}
		}
		
		
	}

}
