package collectionFrameworkList;
import java.util.*;

public class vectorClassCB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<Integer>();
		vector.ensureCapacity(20);
		vector.add(1);
		vector.add(3);
		vector.add(2);
		System.out.println(vector.capacity());
		System.out.println(vector.contains(3));
		//below is list iterator which forms list which iterates over main vector
		ListIterator<Integer>list=vector.listIterator();
		while(list.hasNext()) {
			System.out.print(list.next());
		}
		System.out.println();
		while(list.hasPrevious()) {
			System.out.print(list.previous()+"->");
			//System.out.println(list.previousIndex());
		}
		System.out.println();
		System.out.println(vector.get(1));
	}

}
