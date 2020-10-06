package collectionFrameworkList;

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    getValueInBase(n, b);
 }

 public static void getValueInBase(int n, int b){
     // write code here
   Vector<Integer> qt=new Vector<>();
   int rm;
   while(n>0) 
   {
  	rm=n%b;
  	n=n/b;
  	qt.add(rm);
 }
  Collections.reverse(qt);
 ListIterator<Integer>list=qt.listIterator();
		while(list.hasNext()) {
			System.out.print(list.next());
		}
}
}