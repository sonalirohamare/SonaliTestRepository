package com.student;
import java.util.*;
public class SortStudent {
	public static void main(String args[]) {
		
	
	ArrayList<Student> al=new ArrayList<Student>();
	Student s1=new Student(4,"Sonali  ", "Pune");
	Student s2=new Student(2,"Aboli   ", "Mumbai");
	Student s3=new Student(3,"Bahubali", "Thane");
	Student s4=new Student(1,"Chakuli ", "Anagar");
	Student s5=new Student(5,"Monali  ", "Dhule");
	
	Collections.addAll(al, s1,s2,s3,s4,s5);
	Collections.sort(al,new NameComparator());
	
	System.out.println("---------------------------------------------------------");System.out.println("Sorting by Name:::>>"); 
	al.forEach(s->System.out.println("Roll No::>> "+s.getRollNo()+" Name::>> "+s.getName()+" City ::>>"+s.getCity()));
	
	
	System.out.println("---------------------------------------------------------");
	System.out.println("Sorting by City:::>>"); 
	Collections.sort(al,new CityComparator());
	al.forEach(s->System.out.println("Roll No::>> "+s.getRollNo()+" Name::>> "+s.getName()+" City ::>>"+s.getCity()));
	
	System.out.println("---------------------------------------------------------");
	System.out.println("Sorting Roll number in Ascending Order:::>>"); 
	Collections.sort(al,new RollNoAscComaprator());
	al.forEach(s->System.out.println("Roll No::>> "+s.getRollNo()+" Name::>> "+s.getName()+" City ::>>"+s.getCity()));
	
	System.out.println("---------------------------------------------------------");
	System.out.println("Sorting Roll number in Descending Order:::>>"); 
	Collections.sort(al,new RollNoDescComaprator());
	al.forEach(s->System.out.println("Roll No::>> "+s.getRollNo()+" Name::>> "+s.getName()+" City ::>>"+s.getCity()));
	
	}
}
