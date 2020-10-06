import java.util.*;
class first
{
	Scanner sc = new Scanner(System.in);
	double mass;
	void get(){
	System.out.println("enter the mass");
	mass = sc.nextDouble();
	}
	void calculate(){
		mass = mass*9.8;
		if(mass > 250)
			System.out.println("Error over weight");
		else if(mass<25)
			System.out.println("object massis underweight");
		else
			System.out.println(mass);
	}

}
class Newton{
		 public static void main(String[] args) {
		first obj = new first();
		obj.get();
		obj.calculate();
	}
}