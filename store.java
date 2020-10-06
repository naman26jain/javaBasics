import java.util.*;
class mains{
	int sales;
	Scanner in = new Scanner(System.in);
	void get(){
		
		sales = in.nextInt();
	}
	void calc(){
		sales = sales/100;
	}
	void display(){
	for(int i =0;i<sales;i++)
	{
		System.out.print("*");
	}
	System.out.println(" ");
	}
}
class store{
public static void main(String args[]){
	mains sls[] = new mains[5];
	for(int j =0;j<5;j++)
		sls[j] = new mains();
	for(int j = 0 ; j<5;j++){
		System.out.println("Enter Today's sales amount store" + (j+1));
		sls[j].get();
	}
	
	for(int j = 0 ; j<5;j++){
		sls[j].calc();
	}
	System.out.println("SALES BAR CHART");
	for(int j = 0 ; j<5;j++){
		System.out.print("store"+ (j+1)+ ": ");
		sls[j].display();
	}
}
}	
