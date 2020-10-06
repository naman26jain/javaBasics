import java.util.Scanner;
class Calculator
{
	Scanner in= new Scanner(System.in);
	final double ConeR;
	final double ConeH;
	final double CylR;
	final double CylH;
	final double SphereR;
	final double PBreadth;
	final double PHeight;
	final double PLength;	


	void GetData()
	{
		System.out.println("enter radius of cone: ");
		ConeR=in.nextDouble();
		System.out.println("enter height of cone: ");
		ConeH=in.nextDouble();
		System.out.println("enter radius of cylinder: ");
		CylR=in.nextDouble();
		System.out.println("enter height of cyl: ");
		CylH=in.nextDouble();
		System.out.println("enter radius of Sphere: ");
		SphereR=in.nextDouble();
		System.out.println("enter of breadth of cross-section:");
		PBreadth= in.nextDouble();
		System.out.println("enter of length of cross-section:");
		PLength= in.nextDouble();
		System.out.println("enter of length of Prism:");
		PHeight= in.nextDouble();
	}
	void Display()
	{
		double PrismVol=PBreadth*PLength*PHeight*(0.5);
		double ConeVol=(0.33)*(3.14)*(ConeR*ConeR)*ConeH;
		double CylVol=(3.14)*(CylR*CylR)*CylH;
		double SphereVol=(4/3)*(3.14)*(SphereR*SphereR*SphereR);
		System.out.println("the vol of prisms: "+PrismVol);
		System.out.println("the vol of cone is: "+ConeVol);
		System.out.println("the vol of cyl is: "+CylVol);
		System.out.println("the vol of sphere is: "+SphereVol);
	}
}
public class Area
{
	public static void main(String args[])
	{
		Calculator Find = new Calculator();
		Find.GetData();
		Find.Display();
	}
}