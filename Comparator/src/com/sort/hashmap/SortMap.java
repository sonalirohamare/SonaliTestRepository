package com.sort.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMap {

	    public static HashMap<String, Integer>  sortByValue(HashMap<String, Integer> hm)
	    {
	        
	       List<Map.Entry<String, Integer> > list= new LinkedList<Map.Entry<String, Integer> >( hm.entrySet());
	   
	       
	        Collections.sort(list,(i1, i2) -> i1.getValue().compareTo(i2.getValue()));
	 
	        
	        HashMap<String, Integer> temp  = new LinkedHashMap<String, Integer>();
	        for (Map.Entry<String, Integer> aa : list) {
	            temp.put(aa.getKey(), aa.getValue());
	        }
	        return temp;
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
	 
	        HashMap<String, Integer> hm = new HashMap<String, Integer>();
	 
	       
	        hm.put("Math", 98);
	        hm.put("Data Structure", 85);
	        hm.put("Database", 91);
	        hm.put("Java", 95);
	        hm.put("Operating System", 79);
	        hm.put("Networking", 80);
	        System.out.println(hm);
	        Map<String, Integer> hm1 = sortByValue(hm);
	         System.out.println(hm1);

	    }
	}