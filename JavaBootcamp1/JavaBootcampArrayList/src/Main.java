
public class Main {

	public static void main(String[] args) {
		String[] cities1 = new String[] {"Ankara","İstanbul","İzmir"};
		
		String[] cities2 = new String[] {"Antep","Diyarbakır","Urfa"};
		
		cities1 = cities2;
		cities1[0] = "Adana";
		cities1[1] = "Elazığ";
		System.out.println(cities2[1]);
		System.out.println(cities2[0]);
		cities1 = new String[4];
		
		cities1[3] = "Bursa";
		System.out.println(cities1[1]);
		
		int number1 = 10;
		int number2 = 20;
		
		number1 = number2;
		
		number2 = 30;
		
		System.out.println(number1);
		
	}

}
