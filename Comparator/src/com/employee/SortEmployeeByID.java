package com.employee;

import java.util.ArrayList;
import java.util.Collections;


public class SortEmployeeByID {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(101,"Bharat","Pune"));  
		al.add(new Employee(103,"Ajay","Ahamadnagar"));  
		al.add(new Employee(102,"caddy","Baramati"));  
		Collections.sort(al,(o1,o2)-> o1.id-o2.id);
		
        al.forEach(e->System.out.println(e.id+ " " +e.name+ " " +e.city+ " " ));
	}

}