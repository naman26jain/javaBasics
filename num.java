import java.util.*;
class num{
	
	 public static void main(String args[]) {
	 Scanner in = new Scanner(System.in);
	 
	    String word;
		System.out.println("Enter a word: ");
		word = in.nextLine();
		System.out.println("enter character to search:");
		 char keys = in.next().charAt(0);
		int i;
		int rep =0;
		for(i=0;i< word.length();i++){
			if(keys == word.charAt(i)){
				rep++;
			}
		}
		System.out.println(rep);
	
	}
	
}