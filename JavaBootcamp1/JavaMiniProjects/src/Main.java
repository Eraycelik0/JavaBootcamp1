
public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		//System.out.println(remainder);
		
		boolean isPrime = true;
		
		if (number<2) {
			System.out.println("Number can not be less than two");
			return;
		}
		for (int i=2; i<number; i++) {
			if (number % i == 0) {
				isPrime = false;	
			}
		}
		if(isPrime==true) {
			System.out.println("Number is prime : " + number);
		}else {
			System.out.println("Number is not prime : " + number);
		}
			
	}

}
