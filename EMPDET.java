import java.util.*;
class Payslip{ 
	String EmpName;
	String Designation;
	double BasicPay;
	double DA;
	double HRA;
	double PF;
	double Salary;
	Scanner in = new Scanner(System.in);
	void get()
	{
		System.out.println("enter the name:");
		EmpName = in.nextLine();
		System.out.println("Designation: ");
		Designation = in.nextLine();
		System.out.println("enter basic pay:");
		BasicPay = in.nextDouble();
		System.out.println("enter DA:");
		DA = in.nextDouble();
		System.out.println("enter HRA:");
		HRA = in.nextDouble();
		System.out.println("enter PF:");
		PF = in.nextDouble();
	}
	void salary()
	{
		Salary = BasicPay + DA +HRA +PF;
	}
	void print()
	{
		System.out.println("NAME: "+ EmpName);
		System.out.println("Designation: "+ Designation);
		System.out.println("Salary: "+ Salary);
	}

}
class EMPDET
{
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
        {
        Payslip Data = new Payslip();
        Data.get();
        Data.salary();
        Data.print();
        }
	}
}