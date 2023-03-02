package DataStructures;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
	Set<Integer> inset=new TreeSet<Integer>();
	inset.add(10);
	inset.add(9);
	inset.add(45);
	inset.add(54);
	inset.add(34);
	System.out.println(inset);
	
	Set<String> inset2=new TreeSet<String>(new StringComparator());
	inset2.add("Dw");
	inset2.add("Srr");
	inset2.add("Af");
	inset2.add("Chhh");
	inset2.add("hhhhhB");
	System.out.println(inset2);
	
	Set<Employee> emp=new TreeSet<Employee>(new EmployeeComparator());
	emp.add(new Employee(101,"Mark",1200,"AASSI1"));
	emp.add(new Employee(102,"John",1500,"AASSI2"));
	emp.add(new Employee(103,"Sam",1400,"AASSI3"));
	emp.add(new Employee(104,"Ram",3200,"AASSI4"));
	System.out.println(emp);
	}
}
//comparable- to provide the natural ordering
//comparator - to change the natural ordering
class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int l1=o1.length();
		int l2=o2.length();
		if(l1<l2) {
			return -1;
		}
		else if(l1>l2) {
			return 1;
		}
		else {
			return o1.compareTo(o2);
		}
	}
	
}


class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	double salary;
	transient String aadharno;
	Employee(int id,String name,double salary, String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadharno=aadharno;
	}
	@Override
	public String toString() {
		return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadharno;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return this.id<o.id?-1:this.id>o.id?1:0;
	}
	
}

class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}