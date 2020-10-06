package submissions;
class demo extends Thread{
	public void run() {
		System.out.println("This is a thread example");
		for (int i = 1; i <=10; i++) {
			try {
				Thread.sleep(1500);
				System.out.println(i);
			}
			catch(Exception e){
				System.out.println("nepali");
			}
		}
	}
}
public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo T1 = new demo();
		demo T2 = new demo();
		T1.start();
		T2.start();
		p("This prints in the main class");
		
		
	}
	public static void p(Object s) {
		System.out.println(s);
}
}
