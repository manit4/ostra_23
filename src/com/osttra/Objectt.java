package com.osttra;

public class Objectt {
	
	public static void main(String[] args) {
		
		User user1 = new User(4354, 5543435, "dfvdf", "vfdfv", "egt", 54);
		User user2 = new User(4354, 5543, "dfvdf", "vfdfv", "egt", 5);
		
		//User user2 = new User("dfd", "sdcs", "zzc", "23243", "xvcxv");
		
		boolean status = user1.equals(user2);
		
		//System.out.println(user1 == user2);
		
		System.out.println(status);
		
		
	}

}

//public class Objectt {
//	
//	public static void main(String[] args) {
//		
//		User user = new User("sds", "ffdrv", "dfvdf", "vfdfv", "egt");
//		
//		System.out.println(user.getUsername()+", "+user.getPasword()+", "
//		+user.getFirstName()+", "+user.getLastName()+", "+user.getEmail());
//		
//		System.out.println("-------------------");
//		
//		System.out.println(user.toString());
//	}
//
//}
