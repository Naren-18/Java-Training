package javaf;
import java.io.*;
public class FileHandling {
public static void main(String[] args) {
	fileInputStream();
}
static void fileInputStream() {
	int i;
	File myfile=new File("myfile.txt");
	try {
		FileInputStream fis=new FileInputStream(myfile);
		System.out.println("File opened");
		while((i=fis.read())!=-1) {
			System.out.println((char)i);
		}
		fis.close();
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
static void fileOutputStream() {
	int i;
	File myfile=new File("myfile.txt");
	try {
		FileOutputStream fos=new FileOutputStream(myfile);
		System.out.println("File opened");
		String data="from togram";
		byte[] dataByteArray=data.getBytes();
		fos.write(dataByteArray);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
