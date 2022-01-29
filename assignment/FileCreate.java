package lab;

import java.io.IOException;
import java.io.File;

public class FileCreate {

	public static void main(String[] args) {
		try {
			File obj1 = new File("C:\\Users\\ksav_\\OneDrive\\Desktop\\JAVA\\Journey2Java\\src\\lab\\FileCreate3.txt");
			if(obj1.createNewFile()) {
				System.out.println("\""+obj1.getName()+ "\" is created.");
			}
			else {
				System.out.println("File creation error. \"" +obj1.getName()+ "\" is already exists in this location.");
			}
			if(obj1.exists()) {
					System.out.println("File name: " + obj1.getName());
			      System.out.println("Absolute path: " + obj1.getAbsolutePath());
			      System.out.println("Writeable: " + obj1.canWrite());
			      System.out.println("Readable " + obj1.canRead());
			      System.out.println("File size in bytes " + obj1.length());
			    }
			else {
			      System.out.println("The file does not exist.");
			    }	
		}catch(IOException e) {
		System.out.println("An error occured");
		e.printStackTrace();
		}
	}
}
