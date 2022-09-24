
public class Main {

	public static void main(String[] args) {
		
		showMessage();
		
		calculate();
		
		collection(9,3);
		collection(6,98);
		
		System.out.println(collection(6,3));
		System.out.println(findTenPercent(10,200));
		
		System.out.println(findTenPercent(10,90 ));
		
	}
	//Imagine there are 10 rows
	public static void showMessage() {
		System.out.println("Hello user");
	}
	public static void calculate() {
		System.out.println("Calculated");
	}
	public static int collection(int number1, int number2) {
		int total = number1 + number2;
		return total;
		
	}
	// find ten percent of the two numbers added
	
	/*public static void findTenPercent(int number1, int number2) {
		int total = number1 + number2;
		double result = total * 10/100;
		System.out.println("Result : " + result);
	}*/
	public static double findTenPercent(int number1, int number2) {
		int total = collection(number1,number2);
		double result = total * 10/100;
		return result;
	}
	
	public static double calculateCredit(double loanAmount) {
		//calculations are made
		
		return 125000;
	}
	
	//DRY - Do not Repeat Yourself
}
