
public class Main {

	public static void main(String[] args) {
		//6 --> 1,2,3
		
		int number = 6;
		int total = 0;
		
		for (int i=1; i<number; i++) {
			if (number%i == 0) {
				total = total + i;
			}
		}
		if (total == number) {
			System.out.println("number is a perfect number : " + number);
		}else {
			System.out.println("number is not a perfect number : " + number);
		}
	}

}
