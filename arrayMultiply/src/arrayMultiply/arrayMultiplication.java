package arrayMultiply;

import java.util.Scanner;

class multiplication{
	int[][] mat1=new int[3][3];
	int[][] mat2=new int[3][3];
	int[][] sum=new int[3][3];
	int[][] product=new int[3][3];
	Scanner sc = new Scanner(System.in);
	void get() {
		System.out.println("enter elements of first matrices: ");
		for(int i=0;i<3;i++) {
			for (int j =0;j<3;j++)
				mat1[i][j]=sc.nextInt();
		}
		System.out.println("enter elements of second matrices: ");
		for(int i=0;i<3;i++) {
			for (int j =0;j<3;j++)
				mat2[i][j]=sc.nextInt();
		}
	}
	void calculate() {
		for(int i=0;i<3;i++) {
			for (int j =0;j<3;j++)
				sum[i][j]=mat1[i][j]+mat2[i][j];
		}
		for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
	}
	void display() {
		for(int i=0;i<3;i++) {
			for (int j =0;j<3;j++) {
				System.out.print(sum[i][j]+ " ");
				}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for (int j =0;j<3;j++) {
				System.out.print(product[i][j]+" ");
				}
			System.out.println();
		}
	}
	
	
}

public class arrayMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplication obj = new multiplication();
		obj.get();
		obj.calculate();
		obj.display();
	}

}
