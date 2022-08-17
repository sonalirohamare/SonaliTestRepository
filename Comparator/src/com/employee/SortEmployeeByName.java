package com.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEmployeeByName {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(101,"Bharat","Pune"));  
		al.add(new Employee(106,"Ajay","Mumbai"));  
		al.add(new Employee(105,"caddy","thane")); 
		System.out.println("Before Sorting::>>");
		al.forEach(e->System.out.println(e.id+ " " +e.name+ " " +e.city+ " " ));
		Collections.sort(al,new Comparator<Employee>()
		{
			public int compare(Employee e1,Employee e2)
			{
				return e1.name.compareTo(e2.name);
			}
		});
		System.out.println("\nAfter Sorting by name::>>");
        al.forEach(e->System.out.println(e.id+ " " +e.name+ " " +e.city+ " " ));
	}

}
