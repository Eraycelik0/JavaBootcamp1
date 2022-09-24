
public class Main {

	public static void main(String[] args) {
		
		String studen1 = "Eray" ; 
		String student2 = "Engin";
		String student3 = "Derin";
		
		System.out.println(studen1);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println("-------------------------------------");
		
		String[] students = new String[3];
	
		students[0] = "Eray";
		students[1] = "Engin";
		students[2] = "Derin";
		
		for (int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("--------------------------------------");
		
		String[] cities = {"Ankara", "İstanbul","İzmir"};
		
		//foreach loop
		for(String i : cities) {
			System.out.println(i);
		}
	}

}
