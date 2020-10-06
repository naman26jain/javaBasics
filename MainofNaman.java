package inheritanceOverloading;

import java.util.*;
class naman{
	int n;
	Scanner in=new Scanner(System.in);
	void input(){
		System.out.println("Enter a number : ");
		n=in.nextInt();
	}
	boolean checkPrime(int n){
		int countFactors=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				countFactors++;
			}
		}
		if(countFactors==0){
			return true;
		}
		else{
			return false;
		}
	}
	void option(){
		System.out.println("Enter 1 if you want to check whether "+n+" is an emrip number or not.");
		System.out.println("Enter 2 if you want to check whether "+n+" is a pronic number or not.");
		int choice=in.nextInt();
		switch(choice){
			case 1:
				if(checkPrime(n)){
					int temp1=n;
					int temp2=0;
					int m=1;
					while(temp1!=0){
						temp2 = temp2 * m + temp1 % 10;
						temp1 = (int) temp1 / 10;
						m *= 10;
					}
					if(checkPrime(temp2))
						System.out.println(n+" is an emrip number ");
					else
						System.out.println(n+" is not an emrip number ");
				}
				else{
					System.out.println(n + " is not an emrip number ");
				}
				break;
			case 2:
				int valid = 0;
				for(int i=1;i<=n/2;i++){
					if(i*(i+1)==n){
						valid = 1;
						break;
					}
				}
				if(valid == 0){
					System.out.println(n + " is not a pronic number ");
				}
				else{
					System.out.println(n + " is a pronic number ");
				}
				break;
			default:
				System.out.println("Invalid option.");
		}
		System.out.println("Prime numbers from 1 to 100 are : \n");
		for(int i=2;i<=100;i++){
			if(checkPrime(i)){
				System.out.print(i+" ");
			}
		}
	}
}
class MainOfNaman{
	public static void main(String [] args){
		naman obj = new naman();
		obj.input();
		obj.option();
	}
}