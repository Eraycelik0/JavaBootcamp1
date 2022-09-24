
public class Main {

	public static void main(String[] args) {
		String message = "The weather is nice today";
		String newMessage = giveCity();
		
		System.out.println(newMessage);
		int number = collection(13, 35);
		System.out.println(number);
	}
	
	public static void addAccount() {
		System.out.println("Added...");
	}
	
	public static void deleteAccount() {
		System.out.println("Account is deleted...");
	}
	
	public static void uptadeAccount() {
		System.out.println("Account is uptaded...");
		return;
	}
	
	public static int collection(int number1, int number2) {
		return number1 + number2;
	}
	
	public static String giveCity() {
		return "Ankara";
	}

}
