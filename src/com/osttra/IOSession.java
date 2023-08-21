package com.osttra;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.osttra.pojo.Student;

public class IOSession {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\serial.ser");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Student student = (Student)objectInputStream.readObject();
		
		System.out.println(student.getKey());
		
		System.out.println(student.getValue());
	}
}


//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\serial.ser");
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
//		
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//		
//		Student student = new Student(100, "I am learning Serialization");
//		
//		objectOutputStream.writeObject(student);
//		
//		objectOutputStream.flush();	
//	}
//}

//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		Reader reader = new FileReader(file);
//		
//		BufferedReader bufferedReader = new BufferedReader(reader);
//		
//		String line = null;
//		
//		while( ( line = bufferedReader.readLine()) != null) {
//			
//			System.out.println(line);
//		}
//	}
//}

//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		Writer writer = new FileWriter(file);
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(writer);
//		
//		bufferedWriter.write("Naman, what are you doing");
//		
//		bufferedWriter.flush();
//	}
//}

//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		Writer writer = new FileWriter(file);
//		
//		writer.write("Blue and Black are very good \\ncolorsjefhjrvfvghfgggg");
//		
//		writer.flush();
//	}
//}

//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		Writer writer = new FileWriter(file);
//		
//		char chars[] = {'B', 'l', 'u', 'e'};
//		
//		writer.write(chars);
//		
//		writer.flush();
//	}
//}

//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		Writer writer = new FileWriter(file);
//		
//		writer.write('P');
//		
//		writer.flush();
//	}
//}

//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		FileReader fileReader = new FileReader(file);
//		
//		System.out.println(file.length());
//	}
//}

//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		FileReader fileReader = new FileReader(file);
//		
//		char[] chars = new char[50];
//		
//		int value = fileReader.read(chars);
//		
//		System.out.println("value is "+value);
//		
//		for(char ch : chars) {
//			
//			System.out.print(ch);
//		}
//	}
//}

//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		FileReader fileReader = new FileReader(file);
//		
//		int ch = 0;
//		
//		while( (ch =  fileReader.read()) != -1) {
//			
//			System.out.print((char) ch);
//		}
//	}
//}


//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		FileReader fileReader = new FileReader(file);
//		
//		while( fileReader.read() != -1) {
//			
//			System.out.print((char) fileReader.read());
//		}
//	}
//}

//public class IOSession {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\OstraNotepad\\io.txt");
//		
//		FileReader fileReader = new FileReader(file);
//		
//		char ch = (char) fileReader.read();
//		
//		System.out.println(ch);
//	}
//
//}
