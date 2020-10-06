import java.util.*;

public class delivaryCharges {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of packages: ");
		int numOfPackages=sc.nextInt();
		//System.out.println("Enter coupon code:");
		//String couponCode;
	//	couponCode=sc.nextLine();
		
		
		
		delivaryCharge(numOfPackages);
		
		
		sc.close();
	}
	static public void delivaryCharge(int num) {
		// TODO Auto-generated constructor stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter coupon code: ");
		String discount=sc.nextLine();
		discount=discount.toUpperCase();
	//	System.out.println(discount);
		double cost=0;
		if(num==1)
			cost=5.0;
		else if(num>1||num<6)
			cost=10;
		else if(num>5||num<10)
			cost=15.0;
		else
			cost=20.0;
		if(discount.matches("HALFPRICE"))
			System.out.print("The amount to be paid for the delivery is: $" + cost/2.0);
		else {
			System.out.println("INVALID COUPON CODE");
			System.out.print("The amount to be paid for the delivery is: $" + cost);
		}
		
	}

}
