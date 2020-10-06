import java.util.Scanner;
class Largest
{
	int Num1;
	int Num2;
	int Num3;
	Scanner in = new Scanner(System.in);
	void GetData()
	{
		System.out.println("enter first number: ");
		Num1=in.nextInt();
		System.out.println("enter second number: ");
		Num2=in.nextInt();
		System.out.println("enter third number: ");
		Num3=in.nextInt();
	}
	void Formulate()
	{
		if((Num1>Num2) & (Num1>Num3))
		{
			System.out.println("the first number is the largest");
		}
		else if((Num2>Num1) & (Num2>Num3))
		{
			System.out.println("the second number is the largest");
		}
		else
		{
			System.out.println("The third number is the largest");
		}
	}
}
class Comparison
{
	public static void main(String args[])
{
	Largest Compare = new Largest();
	Compare.GetData();
	Compare.Formulate();
}
}