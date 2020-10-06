
public class nestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	try {
		int n=20;
		System.out.println(n/0);
	}
	catch(ArithmeticException e) {
		System.out.println("Task one completed");
	}
	try {
		int n=20;
		System.out.println(n/0);
	}
	catch(ArithmeticException e) {
		System.out.println("Task two completed");
	}
	System.out.println("on Arsh's request");
}
catch(Exception e) {
	System.out.println("handled with care");
}
	}

}
