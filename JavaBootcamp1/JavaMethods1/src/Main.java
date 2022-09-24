
public class Main {
	public static void collection(int a, int b, int c) {
		System.out.println("Total : " + (a+b+c));
	}
	public static void gretting(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) {
		// parameterized function
		gretting("Eray");
		gretting("World");
		
		collection(10,20,30);
	}

}
