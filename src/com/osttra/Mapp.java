package com.osttra;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.osttra.pojo.Student;


public class Mapp {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		Set<Student> students = new TreeSet<>();
		Student student = null;
		
		map.put(100, "Anmol");
		map.put(102, "Naman");
		map.put(101, "Gaurav");
		map.put(103, "Avi");
		
		Set<Integer> set =  map.keySet();
		
		for(int key : set) {
			
			student = new Student(key, map.get(key));
			students.add(student);
		}
		System.out.println("No of students are: "+students.size());
		
		System.out.println("-------after sorting------------");
		
		for( Student stud : students) {
			
			System.out.println(stud.getKey()+", and the value is "+stud.getValue());
		}
	}
}


//public class Mapp {
//	
//	public static void main(String[] args) {
//		
//		Map<Integer, String> map = new TreeMap<>();
//		
//		map.put(100, "Anmol");
//		map.put(102, "Naman");
//		map.put(101, "Gaurav");
//		
//		Set<Integer> set =  map.keySet();
//		
//		for(int key : set) {
//			
//			System.out.println(map.get(key));
//		}
//	}
//}

//public class Mapp {
//	
//	public static void main(String[] args) {
//		
//		Map<Integer, String> map = new LinkedHashMap<>();
//		
//		map.put(100, "Anmol");
//		map.put(102, "Naman");
//		map.put(101, "Gaurav");
//		
//		Set<Integer> set =  map.keySet();
//		
//		for(int value : set) {
//			
//			System.out.println(map.get(value));
//		}
//		
//		
//	}
//}


//public class Mapp {
//	
//	public static void main(String[] args) {
//		
//		Map<Integer, String> map = new HashMap<>();
//		
//		map.put(100, "Anmol");
//		map.put(102, "Naman");
//		map.put(101, "Gaurav");
//		
//		Set<Integer> set =  map.keySet();
//		
//		for(int value : set) {
//			
//			System.out.println(map.get(value));
//		}
//		
//		
//	}
//}


//public class Mapp {
//	
//	public static void main(String[] args) {
//		
//		Map<Integer, String> map = new HashMap<>();
//		
//		map.put(100, "Anmol");
//		map.put(102, "Naman");
//		map.put(101, "Gaurav");
//		
//		System.out.println(map.size());
//		System.out.println(map.get(102));
//		
//		map.put(102, "Khush");
//		
//		System.out.println(map.size());
//		System.out.println(map.get(102));
//	}
//}
