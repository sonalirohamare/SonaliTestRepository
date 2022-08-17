package com.employee;
import java.util.Comparator;
public class Employee implements Comparator<Employee>{
      int id;
      String name;
      String city;
      public Employee(int id,String name,String city) {
    	  this.id=id;
    	  this.name=name;
    	  this.city=city;
      }
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
      
}
