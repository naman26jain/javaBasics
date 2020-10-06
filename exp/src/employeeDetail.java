
import java.util.Scanner;

public class employeeDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int emp_id;

String name;
int age;

String designation;
int exp_yrs;

String department;
double salary;

Scanner sc= new Scanner(System.in);
try {
	System.out.println("Enter empid: ");
	emp_id=sc.nextInt();
	if(emp_id<1)
		throw new Exception("the employee id must be greater than ");
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
try {
	System.out.println("Enter name: ");
	name=sc.nextLine();
	
}
catch(Exception e) {
	System.out.println("Enter a string value");
}try {
	System.out.println("Enter age: ");
	age=sc.nextInt();
	if(age<19)
		throw new Exception("the employee age must be greater than 18 ");
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
try {
	System.out.println("Enter designation: ");
	designation=sc.nextLine();
}
catch(Exception ef) {
	System.out.println("not a valid designation");
}
try {
	System.out.println("Enter exp years: ");
	exp_yrs=sc.nextInt();
	if(exp_yrs<0)
		throw new Exception("the employee id must be greater than ");
}
catch(Exception ex) {
	System.out.println(ex.getMessage());
}
try {
	System.out.println("Enter department: ");
	department=sc.nextLine();
}
catch(Exception ee) {
	System.out.println("not a valid department");
}
try {
	System.out.println("enter salary");
	salary=sc.nextDouble();
	if(salary<100.0)
		throw new Exception("Enter a valid salary");
		
		
}
catch(Exception eee) {
	System.out.println(eee.getMessage());
}

	}

}
