
public class Main {

	public static void main(String[] args) {
		char character = 'A';
		
		switch (character) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Bold vowels");
			break;
		default:
			System.out.println("Thin vowels");
		}

	}

}
