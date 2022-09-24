
public class Main {

	public static void main(String[] args) {
		/*String student1 = "Eray";
		String student2 = "Engin";
		
		System.out.println(student1);
		System.out.println(student2);
		*/
		
		String[] cities1 = new String[] {"Ankara", "İstanbul", "İzmir"};
		//normal notation
		
		System.out.println(cities1[0]);
		System.out.println(cities1[1]);
		System.out.println(cities1[2]);
		
		System.out.println("------------------------");
		
		//for
		for (int i = 0; i<cities1.length; i++) {
			System.out.println(cities1[i]);
		}
		System.out.println("--------------------------------");
		//foreach
		for(String city : cities1) {
			System.out.println(city);
		}
	}

}
