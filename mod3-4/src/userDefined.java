import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class userDefined
{
   void productCheck(int weight) throws InvalidProductException{
	if(weight<100){
		throw new InvalidProductException("Product Invalid");
	}
   }
   
    public static void main(String args[])
    {
    	userDefined obj = new userDefined();
    	System.out.println("Enter wieght of the product:");
    	Scanner sc=new Scanner(System.in);
    	int wt=sc.nextInt();
    	sc.close();
        try
        {
            obj.productCheck(wt);
            System.out.println("product accepted");
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Weight less than 100");
            System.out.println(ex.getMessage());
        }
    }
}