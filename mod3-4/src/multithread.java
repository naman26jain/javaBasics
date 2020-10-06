import java.util.*;
class thread1 extends Thread{
	int number;
	public thread1(int number) {
		this.number=number;
	}
	public void run() {
		int rem,sum=0,temp;      
		  
		  temp=number;    
		  while(number>0){    
		   rem=number%10;  //getting remainder  
		   sum=(sum*10)+rem;    
		   number=number/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("the number is a palindrome");    
		  else    
		   System.out.println("the number is not a palindrome");
	}
}
class thread2 extends Thread{
	public void run() {
		System.out.println("all the prime numbers from 1 to 50 are:");
		
		for(int i=1;i<=50;i++) {
			boolean flag = false;
	        for(int j = 2; j <= i/2; ++j)
	        {
	            
	            if(i % j == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	            System.out.print(i+", ");
		}
		
	}
}
public class multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		thread1 t1=new thread1(num);
		thread2 t2=new thread2();
		t1.start();
		t2.start();
		sc.close();
	}

}
