package submissions;

import java.util.Scanner;

class first extends Thread  {
 public void run(){

        int num, reversedInteger = 0, remainder, originalInteger;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=in.nextInt();
        originalInteger = num;
        in.close();
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}
class second extends Thread{
	public void run()
{
		 Scanner scanner = new Scanner(System.in);
        
		 int i =0;
	      int num =0;
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n:");
	      int n = scanner.nextInt();
	      scanner.close();
	      try {
	            // thread to sleep for 1000 milliseconds
	            Thread.sleep(2020);
	         } catch (Exception e) {
	            System.out.println(e);
	         }
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);

}
}
public class ThreadsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first obj = new first();
		second obje = new second();
		obj.start();
		obje.start();
	}

}
