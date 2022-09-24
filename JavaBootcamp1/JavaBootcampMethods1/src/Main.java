
public class Main {

	public static void main(String[] args) {
	
		findNumber();
		
	}
	
	public static void findNumber() {
		int[] numbers = new int[] {1,2,3,4,5,6};
		int callNumber = 6;
		
		boolean isThere = false;
		
		for (int number : numbers) {
			if (number == callNumber) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			showMessage("There is number : " + callNumber);
		}else {
			showMessage("There is not number : " + callNumber);
		}
	}
	
	public static void showMessage(String message) {
		System.out.println(message);
	}

}
