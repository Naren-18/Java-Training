package Array;

import java.util.*;


public class Project
{
	public static void main(String[] args) {
		String[] arr={"MAX","SHAW","RAM"};
		while(true){
    		System.out.println("Welcome");
    	    System.out.println("1.Add File");
    	    System.out.println("2.Show Files");
    	    System.out.println("3.Delete Files");
    	    System.out.println("4.Return to Main Menu");
	    Functions obj=new Functions();
    	    Scanner sc=new Scanner(System.in);
    	    int a=sc.nextInt();
    	    switch(a){
    	        case 1:obj.AddFile();
    	                break;
    	        case 2:obj.DeleteFile();
    	                break;
    	        case 3:obj.ShowFiles();
    	                break;
    	        case 4:continue;
	    }
		}
	}
}
class Functions{
    public void AddFile(){
    	System.out.println("ADD");
    }
    public void DeleteFile(){
    	System.out.println("Del");
    }
    public void ShowFiles(){
    	System.out.println("Show");
    }
}