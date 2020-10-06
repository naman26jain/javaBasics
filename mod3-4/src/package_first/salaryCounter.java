package package_first;
public class salaryCounter {

	public void compute(String name, double basePay,int leaves) {
		double salary;
		salary=basePay-((basePay/30)*leaves);
		System.out.print("Amount to be received by "+ name+" is: ");
		System.out.println(salary);
		
	}

}
