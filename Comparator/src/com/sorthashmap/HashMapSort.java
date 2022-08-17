package com.sorthashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapSort  {
	public static  HashMap<Integer,String> sortMap(HashMap<Integer,String> hs)
	{
		
		List<Map.Entry<Integer, String>> list=new LinkedList<>(hs.entrySet());
		
		
		Collections.sort(list,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
		
		HashMap<Integer,String> temp =new LinkedHashMap<Integer,String>();
		for(Map.Entry<Integer, String> aa:list)
		{
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
		
	}
	
	public static void main(String[] args)
	{
		HashMap<Integer,String> hs=new HashMap<>();
		hs.put(1, "January");
		hs.put(9, "September");
		hs.put(2, "February");
		hs.put(3, "March");
		hs.put(10, "October");
		hs.put(4, "April");
		hs.put(11, "November");
		hs.put(8, "August");
		hs.put(5, "May");
		hs.put(6, "June");
		hs.put(7, "July");
		hs.put(8, "August");
		hs.put(12, "December");
		System.out.println("\n Original Map::>>>");
		System.out.println(hs);
		HashMap<Integer,String> sortedMap=sortMap(hs);
		System.out.println("\n Sorted Map::>>>");
		System.out.println(sortedMap);
		
	}

	

	
	

}
