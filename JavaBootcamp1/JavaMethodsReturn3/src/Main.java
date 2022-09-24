
public class Main {
	/*public static Integer collection(int a, int b, int c) {
		//System.out.println("Total : " + (a+b+c));
	
		return(a+b+c);
	}*/
	
	public static Integer multiplyByTwo(int a) {
		return a*2;
	}
	public static Integer addWithTwo(int a) {
		return a+2;
	}
	public static Integer divideInHalf(int a) {
		return a/2;
	}
	
	public static Integer attempt(int a) {
		//code doesn't work after return
		System.out.println("Output is given...");
		
		return a*2;
	}
	public static void main(String[] args) {
		
		//System.out.println("Total : " + collection(12, 13, 14));
		System.out.println("Result of multiplication : " + multiplyByTwo(10));
		System.out.println("Result of total : " + addWithTwo(10));
		System.out.println("Result of divide : " + divideInHalf(10));
	
		System.out.println("Result : " + addWithTwo(multiplyByTwo(divideInHalf(1000))) );
	
		System.out.println(attempt(5));
	}

}
