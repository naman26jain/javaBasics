package package_first;

import java.util.Scanner;

public class calculate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the employee:");
		String name=sc.nextLine();
		System.out.println("Enter the base pay amount: ");
		double base=sc.nextDouble();
		System.out.println("Enter the no. of leaves during previous month:");
		int leaves=sc.nextInt();
		
		
		salaryCounter p= new salaryCounter();
		p.compute(name,base,leaves);
		sc.close();
	}}

