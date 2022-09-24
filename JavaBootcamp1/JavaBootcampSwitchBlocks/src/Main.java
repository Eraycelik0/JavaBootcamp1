
public class Main {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("excellent, you passed the class");
			break;
		case 'B':
			System.out.println("good, you passed the lesson");
			break;
		case 'C':
			System.out.println("you passed the lesson");
			break;
		case 'D':
			System.out.println("you passed the lesson");
			break;
		case 'F':
			System.out.println("Sorry, you failed the course");
			break;
		default:
			System.out.println("undefined note");
		}
	}

}
