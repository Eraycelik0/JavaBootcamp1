
public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[]{1,2,5,7,9,0};
		
		int numberToCall = 34;
		
		boolean isThere = findNumber(numbers,numberToCall);//true
					//true,9
		showMessage(isThere, numberToCall);
	}
	public static void showMessage(boolean isThere, int numberToCall) {
		
		String message = "";
		if(isThere==true) {
			message = "There is number : " + numberToCall;
			System.out.println(message);
		}else {
			message = "There isn't number : " + numberToCall;
			System.out.println(message);
		}
	}
	public static boolean findNumber(int[] numbers, int numberToCall) {
		boolean isThere = false;
		
		for (int number : numbers) {
			if (number == numberToCall) {
				isThere = true;
				break;
			}
		}
		
		return isThere;
	}
	
	//write a function
	//take two parameters. p1 : array p2: 3
	//the number 3 is in the array
}
