package Project;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class Phase_1_Project 
{
    public static void main(String[] args) 
    {
        ArrayList <String> list = new ArrayList<String>();
        while (true) 
        {
	        System.out.println("Welcome to Lockers Pvt. Ltd :)");
	        System.out.println(" Developed by Narendra Kumar");
	        System.out.println("Employee ID:10847");
	        System.out.println("**");
	        System.out.println("Please select one the following");
	        System.out.println("1.Retrieving the files in an Ascending Order");
	        System.out.println("2.Performing file operations:");
	        System.out.println("3.Exit");
	        System.out.println("Enter Your Choice");
            Scanner sc = new Scanner(System.in);       
                  int a = sc.nextInt();
             switch (a) 
                {
                case 1:
                    if (list.isEmpty()) 
                    {
                        System.out.println("No files found. Please create a file.");
                    } else
                    {
                    Collections.sort(list);
		            System.out.println(list);
                    }
                    break;
                case 2: 
                     list=fileoperations(list);
                    break;
                case 3:
                	System.out.println("Have a nice day!! Thank You ");
                    System.exit(1);
                default:
                    System.out.println("Oops!! please enter the valid number");
                    break;
               }
            }
        }
   
    private static ArrayList<String> fileoperations(ArrayList<String> list)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    	    System.out.println("-----File Operations-----");
    	    System.out.println("1. Add file");
    	System.out.println("2. Delete file");
    	System.out.println("3. Search file");
    	System.out.println("4. return to main menu");
    	System.out.println("Enter Your Choice");
        int name = sc.nextInt();
    	    switch (name) 
        {
        case 1: list = AddFile(list);
              System.out.println("File is added:"+list);
                break;
        case 2:
            list = DeleteFile(list);   
            System.out.println(list);
            System.out.println("File is deleted:"+list);
            break;
        case 3:
            Search(list);
            break;
        case 4:
        	return list;
        default:
            System.out.println("Oops!! please enter the valid number");
            break;
        }
    	
    	}
    	
	}
    

	
	public static ArrayList<String> AddFile(ArrayList<String> list) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to Add in set");
        String name = sc.nextLine();
        list.add(name);
        return list;
    }
    public static ArrayList<String> DeleteFile(ArrayList<String> list) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to Remove in set");
        String name = sc.nextLine();
        list.remove(name);
        return list;
    }
    public static void Search(ArrayList<String> list) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to Search in set");
        String name = sc.nextLine();
        int temp=list.indexOf(name);
		if(temp==-1) {
			System.out.println("Element Not Found");
		}
		else {
			System.out.println("Element Found at "+temp);
		}
    }
}