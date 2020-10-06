package codeArena;

import java.util.Scanner;

import java.util.Arrays;

public class diffSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("##");
		int test=sc.nextInt();
		while(test>0) {
		System.out.println("##");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("##");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		soln(array);
		test--;
		}
		sc.close();
	}
	static void soln(int[] arr) 
	{
		Arrays.sort(arr);
		int targetDifference=arr[0]-arr[1];
		int counter=0;
		for(int j=1;j<arr.length-1;j++)
		{
			if(arr[j]-arr[j+1]==targetDifference) {
				counter =j+1;
				continue;
		}
			else
			{
				break;
			}
		}
		if(counter==arr.length-1) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}}
	
