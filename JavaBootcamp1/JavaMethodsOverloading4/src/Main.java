
public class Main {
	public static void collection(String a, String b) {
		System.out.println(a + " " + b );
	}
	
	public static void collection(int a, int b) {
		System.out.println("Total : " + (a+b));
	}
	public static void collection(int a, int b, int c) {
		System.out.println("Total : " + (a+b+c));
	}
	
	public static void calculateScore(String name, int score) {
		System.out.println(name + " has " + score + " points ");
	}
	public static void calculateScore(int score) {
		System.out.println("unnamed player has points : " + score  );
	}
	public static void calculateScore(String name) {
		System.out.println(name + " has no points...");
	}
	public static void main(String[] args) {
		
		collection(2,4,6);
		collection(2,4);
		collection("Eray", "Celik");
		
		calculateScore("Eray", 1000);
		calculateScore("Arif");
		calculateScore(1500);
	}

}
