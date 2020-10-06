package submissions;

class even implements Runnable{
	public void run() {
		int limit=20;
		for (int i = 0; i <=limit; i++) {
			try{Thread.sleep(1000);
		}
			catch(Exception e) {
				System.out.println("exception");
			}
			if((i&1)==0) {
				System.out.println(i+" is an even number");
			}
		
	}
	
}
}
class odd implements Runnable{
	public void run() {
		int limit=20;
		for (int i = 1; i <=limit; i++) {
			try{Thread.sleep(3000);
		}
			catch(Exception e) {
				System.out.println("exception");
			}
			if((i&1)!=0) {
				System.out.println(i+" is an odd number");
			}
		
	}
	
}
}
public class ThreadsTwo {

	public static void main(String[] args) {
		even obj=new even();
		Thread t1=new Thread(obj);
		t1.setName("Even numbers");
		System.out.println(t1.getName()+" is created with id no.: "+ t1.getId());
		 System.out.println("t1 is alive before start : "+t1.isAlive()); 
		t1.start();
		 System.out.println("t1 is alive after start : "+t1.isAlive()); 
		 try
	        { 
	            System.out.println("Current Thread: "
	                  + Thread.currentThread().getName()); 
	            t1.join(); 
	        } 
	  
	        catch(Exception ex) 
	        { 
	            System.out.println("Exception has " + 
	                                "been caught" + ex); 
	        } 
		
		odd obje=new odd();
		Thread t2=new Thread(obje);
		t2.setName("odd numbers");
		System.out.println(t2.getName()+" is created with id no.: "+ t2.getId());
        System.out.println("t2 is alive before start : "+t2.isAlive()); 
		t2.start();
		 System.out.println("t2 is alive after start : "+t2.isAlive()); 
		
	}

}
