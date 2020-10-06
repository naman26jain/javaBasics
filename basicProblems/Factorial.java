import java.util.Scanner;
class Factorial
{	
	public static void main(String args[])
{
	Scanner in= new Scanner(System.in);
	final int N;
	System.out.println("enter the number to find factorial of: ");
	N=in.nextInt();
	int Fact=1;
	for(int i=5;i>0;i--)
	{
		Fact = Fact*i;
	}
	System.out.println("factorial of "+N );
	System.out.println(Fact);
}
}