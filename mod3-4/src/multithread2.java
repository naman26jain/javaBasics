class evenThread implements Runnable{
	

	public void run() {
		for(int i=1;i<=50;i++) {
			if((i&1) ==0)
			{
				System.out.print(i+", ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class oddThread implements Runnable{
	

	public void run() {
		for(int i=1;i<=50;i++) {
			if((i&1) !=0)
			{
				System.out.print(i+", ");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
public class multithread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenThread r=new evenThread();
		Thread t1=new Thread(r);
		oddThread r1=new oddThread();
		Thread t2=new Thread(r1);
		//System.out.println(t1.isAlive());
		t1.start();
		//System.out.println(t1.getId());
	//	System.out.println(t1.isAlive());
		//t2.setName("printsOddNo");
		t2.start();
		//System.out.println(t2.getName());
	}

}
