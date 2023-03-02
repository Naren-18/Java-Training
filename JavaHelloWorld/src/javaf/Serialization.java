package javaf;
import java.io.*;
public class Serialization {
	public static void main(String[] args) {
		SerializationDemoSimplified();
		DeserializationDemo();
	}

	private static void SerializationDemoSimplified() {
		// TODO Auto-generated method stub
		
	}

	private static void DeserializationDemo() {
		try (FileInputStream fis=new FileInputStream("emp.scr");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			Employee emp=(Employee) ois.readObject(); 
			System.out.println();
		}
	}

}
