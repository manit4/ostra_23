package com.osttra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.osttra.exception.AgeLessThan17Exception;
import com.osttra.exception.AgeNotMorethan17Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			
			ExceptionHandling handling = new ExceptionHandling();
			
			handling.first();
		}
		catch (Exception e) {
			System.out.println("inside catch of main()");
			e.printStackTrace();
		}
		

	}

	void first() throws AgeLessThan17Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Age");

		int age = sc.nextInt();

		if (age < 18) {

			throw new AgeLessThan17Exception();
		} else {

			System.out.println("welcome to Carnival..");
		}
	}
}

//public class ExceptionHandling {
//
//	public static void main(String[] args) throws IOException {
//
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Age");
//		
//		int age = sc.nextInt();
//		
//		if(age < 18) {
//			
//			throw new AgeLessThan17Exception();
//		}
//		else {
//			
//			System.out.println("welcome to Carnival..");
//		}
//	}
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) throws IOException {
//
//		
//
//			ExceptionHandling handling = new ExceptionHandling();
//
//			handling.first();
//
//			System.out.println("inside main()");
//
//		
//
//	}
//
//	void first() throws IOException {
//
//		second();
//	}
//
//	void second() throws IOException {
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\fileio.txt");
//
//		FileReader fileReader = new FileReader(file);
//
//		char ch = (char) fileReader.read();
//
//		System.out.println(ch);
//	}
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//
//		try {
//
//			ExceptionHandling handling = new ExceptionHandling();
//
//			handling.first();
//
//			System.out.println("inside main()");
//
//		} catch (Exception e) {
//			System.out.println("inside catch of second()");
//			e.printStackTrace();
//		}
//
//	}
//
//	void first() throws IOException {
//
//		second();
//	}
//
//	void second() throws IOException {
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\fileio.txt");
//
//		FileReader fileReader = new FileReader(file);
//
//		char ch = (char) fileReader.read();
//
//		System.out.println(ch);
//	}
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//
//		ExceptionHandling handling = new ExceptionHandling();
//
//		handling.first();
//
//		System.out.println("inside main()");
//
//	}
//
//	void first() {
//
//		try {
//
//			second();
//
//		} catch (Exception e) {
//			System.out.println("inside catch of second()");
//			e.printStackTrace();
//		}
//	}
//
//	void second() throws IOException {
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\fileio.txt");
//
//		FileReader fileReader = new FileReader(file);
//
//		char ch = (char) fileReader.read();
//
//		System.out.println(ch);
//	}
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		
//			ExceptionHandling handling = new ExceptionHandling();
//			
//			handling.first();	
//			
//			System.out.println("inside main()");
//
//	}
//	
//	void first() {
//		
//		second();
//	}
//	
//	void second() {
//		
//		try {
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\fileio.txt");
//			
//			FileReader fileReader = new FileReader(file);
//			
//			char ch = (char) fileReader.read();
//			
//			System.out.println(ch);
//			
//		}catch (Exception e) {
//			System.out.println("inside catch of second()");
//			e.printStackTrace();
//		}	
//	}
//
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) throws IOException {
//		
//		
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\fileio.txt");
//			
//			FileReader fileReader = new FileReader(file);
//			
//			char ch = (char) fileReader.read();
//			
//			System.out.println(ch);
//			
//		
//
//	}
//
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\fileio.txt");
//			
//			FileReader fileReader = new FileReader(file);
//			
//			char ch = (char) fileReader.read();
//			
//			System.out.println(ch);
//			
//		}
//		catch (Exception e) {
//			System.out.println("inside catch of Exception...");
//			e.printStackTrace();
//		}
//
//	}
//
//}

//---------Exception Handling----16-08----

//public class ExceptionHandling {
//
//	static Scanner sc = new Scanner(System.in);
//
//	public static void main(String[] args) {
//
//		try {
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter denominator!!");
//
//			int denominator = sc.nextInt();
//
//			int i = 4 / denominator;
//
//			String name = "Rishika";
//
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//
//		}
//		finally {
//			System.out.println("inside finally block...");
//		}
//
//	}
//
//}

//public class ExceptionHandling {
//
//	static Scanner sc = new Scanner(System.in);
//
//	public static void main(String[] args) {
//
//		try {
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter denominator!!");
//
//			int denominator = sc.nextInt();
//
//			int i = 4 / denominator;
//
//			String name = "Rishika";
//
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//
//		} catch (ArithmeticException e) {
//			System.out.println("inside ArithmeticException catch...");
//			e.printStackTrace();
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("inside StringIndexOutOfBoundsException catch...");
//			e.printStackTrace();	
//		}
//		finally {
//			System.out.println("inside finally block...");
//		}
//
//	}
//
//}

//public class ExceptionHandling {
//	
//	static Scanner sc = new Scanner(System.in);
//
//	public static void main(String[] args) {
//
//		askDenominator();
//	}
//
//	static void askDenominator() {
//
//		try {
//
//			System.out.println("Enter denominator!!");
//
//			int denominator = sc.nextInt();
//
//			int i = 4 / denominator;
//			
//			askIndex();
//		} catch (ArithmeticException e) {
//			System.out.println("insdie catch of Arith");
//			askDenominator();
//		}
//	}
//	
//	static void askIndex() {
//		
//		String name = "Rishika";
//		
//		try {
//			
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("inside catch of StringIndex and you should "
//					+ "give value less than "+name.length());
//			askIndex();
//		}
//	}
//}

//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int i = 4/denominator;
//			
//			String name = "Rishika";
//			
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//			
//		}catch (ArithmeticException e) {
//			System.out.println("inside ArithmeticException catch...");
//			e.printStackTrace();
//			main(null);
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("inside StringIndexOutOfBoundsException catch...");
//			e.printStackTrace();
//			main(null);
//		}
//	}
//}

//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int i = 4/denominator;
//			
//			
//		}catch (Exception e) {
//			System.out.println("Please do not give 0 as denominator!!");
//			e.printStackTrace();
//			main(null);
//		}
//		System.out.println("second statement");	
//	}
//}
