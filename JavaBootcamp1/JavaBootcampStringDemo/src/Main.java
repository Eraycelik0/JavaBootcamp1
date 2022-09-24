
public class Main {

	public static void main(String[] args) {
		String message = "The weather is very nice today.";
		
		System.out.println(message);
		
		System.out.println("number of elements : " + message.length());
		System.out.println("fifth element : " + message.charAt(4));
		System.out.println(message.concat(". very nice"));
		System.out.println(message.startsWith("a"));
		System.out.println(message.endsWith("."));
		
		char[] characters = new char[5];
		message.getChars(0, 4, characters, 0);
		
		System.out.println(characters);
		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('e'));
		
		
		
	}

}
