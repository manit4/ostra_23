package com.osttra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class A implements Comparable<A> {

	int i = 4, j = 5;

	@Override
	public int compareTo(A o) {

		int value = 0;

		if (this.i < o.i) {
			value = 1;
		} else {
			value = -1;
		}
		return value;
	}
}

class JComparator implements Comparator<A> {

	@Override
	public int compare(A o1, A o2) {

		int value = 0;

		if (o1.j < o2.j) {

			value = -1;
		} else {
			value = 1;
		}
		return value;
	}
}

public class Collectionn {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(345);
		list.add(424);
		list.add(12);
		list.add(23);

		for (int value : list) {

			System.out.println(value);
		}

		Collections.sort(list);

		for (int value : list) {

			System.out.println(value);
		}
	}
}

//class A implements Comparable<A>{
//	
//	int i = 4, j = 5;
//
//	@Override
//	public int compareTo(A o) {
//		
//		int value = 0;
//		
//		if( this.i < o.i) {
//			value = 1;
//		}
//		else {
//			value = -1;
//		}
//		return value;
//	}
//}
//
//class JComparator implements Comparator<A> {
//
//	@Override
//	public int compare(A o1, A o2) {
//
//		int value = 0;
//		
//		if( o1.j < o2.j) {
//			
//			value = -1;
//		}
//		else {
//			value = 1;
//		}
//		return value;
//	}
//}
//
//
//
//
//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		Set<A> set = new TreeSet<>(new JComparator());
//		
//		A a1 = new A();    A a2 = new A();   A a3 = new A();
//		
//		a2.j = 10;   a1.j = 19;
//		
//		set.add(a1);   set.add(a2);    set.add(a3);
//		
//		for( A a : set) {
//			
//			System.out.println(a.i+", "+a.j);
//		}
//		
//
//	}
//}

//class A implements Comparable<A>{
//	
//	int i = 4, j = 5;
//
//	@Override
//	public int compareTo(A o) {
//		
//		int value = 0;
//		
//		if( this.i < o.i) {
//			value = -1;
//		}
//		else {
//			value = 1;
//		}
//		return value;
//	}
//	
//	
//}
//
//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		Set<A> set = new TreeSet<>();
//		
//		A a1 = new A();    A a2 = new A();   A a3 = new A();
//		
//		a2.i = 10;
//		
//		set.add(a1);   set.add(a2);    set.add(a3);
//		
//		for( A a : set) {
//			
//			System.out.println(a.i+", "+a.j);
//		}
//		
//
//	}
//}

//class A {
//	
//	int i = 4, j = 5;
//	
//	public boolean equals(Object obj) {
//		System.out.println("inside equals...");
//		boolean status = false;
//		
//		if( this.i == ((A)obj).i ) {
//			status = true;
//		}
//		return status;
//	}
//	
//	public int hashCode() {
//		
//		return 10;
//	}
//}
//
//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		Set<A> set = new LinkedHashSet<>();
//		
//		A a1 = new A();    A a2 = new A();   A a3 = new A();
//		
//		a2.i = 10;
//		
//		set.add(a1);   set.add(a2);    set.add(a3);
//		
//		System.out.println(set.size());
//		
////		A a1 = new A();    A a2 = new A();   A a3 = new A();
////		
////		System.out.println(a1.hashCode());
////		System.out.println(a2.hashCode());
////		System.out.println(a3.hashCode());
////		String s1="abc";
////		String s2=s1;
////		System.out.println(s2.hashCode());
////		System.out.println(s1.hashCode());
//		
//		
////		Set<String> set = new HashSet<>();
////		
////		String str1 = new String("abc");
////		String str2 = new String("abc");
////		
////		set.add(str1);   set.add(str2);
////		
////		System.out.println(set.size());
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		Set<String> set = new TreeSet<>();
//		
//		set.add("Naman");
//		set.add("Trijal");
//		set.add("Deepti");
//		set.add("Gaurav");
//		
//		System.out.println(set.size());
//		
//		Iterator<String> iterator = set.iterator();
//		
//		while( iterator.hasNext()) {
//			
//			System.out.println(iterator.next());
//		}	
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		Set<String> set = new LinkedHashSet<>();
//		
//		set.add("Naman");
//		set.add("Trijal");
//		set.add("Deepti");
//		set.add("Gaurav");
//		
//		System.out.println(set.size());
//		
//		Iterator<String> iterator = set.iterator();
//		
//		while( iterator.hasNext()) {
//			
//			System.out.println(iterator.next());
//		}	
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		Set<String> set = new HashSet<>();
//		
//		set.add("Naman");
//		set.add("Trijal");
//		set.add("Deepti");
//		set.add("Trijal");
//		
//		System.out.println(set.size());
//		
//		Iterator<String> iterator = set.iterator();
//		
//		while( iterator.hasNext()) {
//			
//			System.out.println(iterator.next());
//		}	
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		Set<String> set = new HashSet<>();
//		
//		set.add("Naman");
//		set.add("Trijal");
//		set.add("Deepti");
//		set.add("Trijal");
//		
//		System.out.println(set.size());
//		
//		for( String value : set) {
//			
//			System.out.println(value);
//		}
//		
//		
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		Set<String> set = new HashSet<>();
//		
//		set.add("Naman");
//		set.add("Trijal");
//		set.add("Deepti");
//		set.add("Trijal");
//		
//		System.out.println(set.size());
//		
//		
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = new ArrayList<>();
//		
//		list.add(34);
//		list.add(12);
//		list.add(3434);	
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		list.add(34);
//		list.add(12);
//		list.add(3434);
//		
//		list.add(1,78);
//		
//		list.set(2, 1);
//		
//		System.out.println(list);
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		ArrayList<String> list = new ArrayList<>();
//		
//		list.add("34");
//		list.add("12");
//		list.add("Khush");
//		
//		list.add(1, "Parv");
//		
//		list.set(8, "Anmol");
//		
//		System.out.println(list);
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		ArrayList<String> list = new ArrayList<>();
//		
//		list.add("34");
//		list.add("12");
//		list.add("Khush");
//		
//		list.add(1, "Parv");
//		
//		list.set(0, "Anmol");
//		
//		System.out.println(list);
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		ArrayList list = new ArrayList();
//		
//		list.add(34);
//		list.add(12);
//		list.add("Khush");
//		
//		list.add(1, "Parv");
//		
//		list.set(0, "Anmol");
//		
//		System.out.println(list);
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		ArrayList list = new ArrayList();
//		
//		list.add(34);
//		list.add(12);
//		list.add("Khush");
//		
//		list.add(1, "Parv");
//		
//		list.set(0, "Anmol");
//		
//		for( int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i));
//		}
//	}
//
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		ArrayList list = new ArrayList();
//		
//		list.add(34);
//		list.add(12);
//		list.add("Khush");
//		
//		//System.out.println(list.size());
//		
//		System.out.println(list.get(1));
//		
//		list.clear();
//		
//		System.out.println(list.size());
//	}
//
//}
