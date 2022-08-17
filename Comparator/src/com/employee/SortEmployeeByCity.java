package com.employee;

import java.util.ArrayList;
import java.util.Collections;


public class SortEmployeeByCity {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(101,"Bharat","Pune"));  
		al.add(new Employee(106,"Ajay","Ahamadnagar"));  
		al.add(new Employee(105,"caddy","Baramati"));  
		Collections.sort(al,(o1,o2)->o1.city.compareTo(o2.city));
		
        al.forEach(e->System.out.println(e.id+ " " +e.name+ " " +e.city+ " " ));
	}

}