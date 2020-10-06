import java.util.*;
public class Arrayoperation{
	
	public void get(){
		Scanner in = new Scanner(System.in);
		int[][] Array1= new int[3][3];
		int[][] Array2= new int[3][3];
		int[][] Array3= new int[3][3];
		int[][] Array4= new int[3][3];
		System.out.println("Enter the element for Array2:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("Enter element for position: "+i+j);
				Array1[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the element for Array2:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("Enter element for position: "+i+j);
				Array2[i][j]= in.nextInt();
			}
		}
	}
	public void ADD()
	{		
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Array3[i][j]= Array1[i][j]+Array2[i][j];
				System.out.println(Array3);}
		}
	}
	public void MUl(){


		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				Array4[i][j]=0;      
				for(int k=0;k<3;k++)      
				{      
					Array4[i][j]+=Array1[i][k]*Array2[k][j];      
				}
			System.out.println(Array4[i][j]);
		}
	}	
}	
class arrayoperation{
	public static void main(){
		Arrayoperation obj = new Arrayoperation();
		obj.get();
		obj.ADD();
		obj.MUL();
		
	}
}