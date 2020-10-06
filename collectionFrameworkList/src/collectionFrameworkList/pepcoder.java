package collectionFrameworkList;

import java.util.*;
import java.util.ArrayList;
  
public class pepcoder{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      getValueInBase(n, b);
   }
  
   public static void getValueInBase(int n, int b){
       // write code here
    ArrayList<Integer> qt=new ArrayList<>();
    int rm;
    while(n>0) {
    	rm=n%b;
    	n=n/b;
    	qt.add(rm);
    }
    
   }
  }