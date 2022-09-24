import java.util.Scanner;

public class Main {
	public static int extraction(int a, int b) {
		return a-b;
	}
	public static double division(int a, int b) {
		return a/b;
	}
	public static int collection(int a, int b) {
		return a+b;
	}
	public static int collection(int a, int b, int c) {
		return a+b+c;
	}
	public static double multiplication(int a, int b, int c) {
		return a*b*c;
	}
	public static double multiplication(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		// simple calculator
		Scanner scanner = new Scanner(System.in);
		String transactions = "1 : collection\n"
							+"2 : extraction\n"
							+"3 : multiplication\n"
							+"4 : division\n"
							+"Press q to exit";
		System.out.println("----------------------------");
		System.out.println(transactions);
		System.out.println("----------------------------");
		while (true) {
			System.out.print("Select the action : ");
			String process = scanner.nextLine();
			
			if (process.equals("q")) {
				System.out.println("exiting the program...");
				break;
			}else if (process.equals("1")) {
				System.out.println("How many values will you collect?");
				
				int hmNumber = scanner.nextInt();
				
				if(hmNumber==2) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Result of total : " + collection(a, b));
				}else if (hmNumber==3) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c");
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Result of total : " + collection(a, b, c));
				}else {
					System.out.println("Undefined number...");
				}
			}else if (process.equals("2")) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b:");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Result of extraction : " + extraction(a, b));}else if (process.equals("3")) {
				System.out.println("How many values will you multiplication?");
				int hmNumber = scanner.nextInt();
				if(hmNumber==2) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b:");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Result of multiplication : " + multiplication(a, b));
				}else if (hmNumber==3) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c");
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Result of multiplication : " + multiplication(a, b, c));
				}else {
					System.out.println("undefined number...");
				}
			}else if(process.equals("4")) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b:");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Result of division : " + division(a, b));
			}
			else {
				System.out.println("Undefined process....");
			}
		}
	}

}
