
public class Main {
	//variable arguments
	public static void main(String[] args) {
		String message = "The weather is nice today";
		String newMessage = giveCity();

		System.out.println(newMessage);

		int number = collection(2, 5);
		System.out.println(number);
		int total = collection(1,2,3,4,5);

	}

	public static void add() {
		System.out.println("Customer added");
	}

	public static void delete() {
		System.out.println("customer deleted");
	}

	public static void uptade() {
		System.out.println("Customer uptaded");
	}

	public static int collection(int number1, int number2) {
		return number1 + number2;
	}

	public static int collection(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		System.out.println("Total : " + total);
		return total;
	}

	public static String giveCity() {
		return "Ankara";
	}
}
