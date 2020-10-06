package collectionFrameworkList;

import java.util.ArrayList;

public class arrayListCB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList();
		ar.add(3);
		ar.add(76);
		ar.add(87);
		ar.add(4);
		ar.add(10);
		ArrayList<Integer> ar1 =new ArrayList();
		ar1.add(12);
		ar1.add(23);
		ar1.addAll(ar);
		System.out.println(ar1);
		System.out.println(ar.size());
		System.out.println(ar.contains(4));
		System.out.println(ar);
		ar.add(1,3);
		System.out.println(ar);
		System.out.println(ar.remove(3));
		System.out.println(ar);
		System.out.println(ar.set(1, 10));
		System.out.println(ar.indexOf(10));
		System.out.println(ar.lastIndexOf(10));
		ar1.removeAll(ar1);
		ar1.retainAll(ar);
		System.out.println(ar1);
		try{System.out.println(ar1.subList(0, 3));
	}
		catch(Exception e) {
			System.out.println("error");
		}

	}}
