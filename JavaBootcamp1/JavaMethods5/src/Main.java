
public class Main {

	public static void main(String[] args) {
		// Local variables
		
		/*int a = 4;
		String print = "Hello";
		
		if (a<10) {
			int b = 5;
			System.out.println(print);
		}
		
		int b=10;
		System.out.println(b);
		*/
		
		/*for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		int i;
		System.out.println(i); 
		*/
		
		int i = 1;
		while (i<10) {
			if (i%2==0) {
				String print = "double";
				System.out.println(print);
			}
			// System.out.println(print); cannot be used outside of if...
			i++;
		}
	}

}
