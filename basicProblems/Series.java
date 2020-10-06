import java.util.Scanner;
class Series
{
	public static void main(String args[])
	{
	final float n;
	Scanner in= new Scanner(System.in);
	System.out.println("enter the number till which sum is needed: ");
	n=in.nextFloat();
	float sum=0;
	for(float i=1;i<=n;i++)
	{
		sum=sum+(1/i);
	}
	System.out.println("the sum is : "+sum);
	}
}