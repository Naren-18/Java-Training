package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoWithList {
	public static void main(String[] args) {
		List<String> mylist=new ArrayList<>();
		mylist.add("ZOE");
		mylist.add("MAX");
		mylist.add("JOHN");
		mylist.add("WILL");
		System.out.println(mylist);
		Collections.sort(mylist);
		System.out.println(mylist);
		
		int result=Collections.binarySearch(mylist, "MAX");
		System.out.println("Max Found at"+result);
		result=Collections.binarySearch(mylist, "ZOE");
		System.out.println("Max Found at"+result);
	}
}
