package submissions;

import java.util.*;

import java.util.Arrays;

public class arrayQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Scanner in = new Scanner(System.in);
		double sum=0;
		System.out.println("Enter number of elements: ");
		final int len = in.nextInt();
		int[] array=new int[len];
		System.out.println("Enter elements: ");
		for(int i=0;i<len;i++) {
			array[i]=in.nextInt();
			sum +=array[i];
		}
		solution(array, len, sum);
		in.close();
	}
	static void solution(int[] arr,int length, double sum) {
		Arrays.sort(arr);
		System.out.println("The highest number is "+ arr[length-1]);
		System.out.println("The smallest number is "+arr[0]);
		System.out.println("The total number of elements in array are "+ length);
		System.out.println("The average of all the elements in the array is "+ (sum/length));
		
		
	}

}
