package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.html.ListView;

public class SortMap {
	
	public static void sortMap(Map<String, Integer> input) {

		List<Map.Entry<String, Integer>> list = new ArrayList<>(input.entrySet());
		Collections.sort(list, (Comparator<Map.Entry<String, Integer>>)
				(o1,o2)->o2.getKey().compareTo(o1.getKey()));

		System.out.println(list);
		//System.out.println(input.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()));

		List<Map.Entry<String,Integer>> l = input.entrySet().stream().sorted(Map.Entry.comparingByValue()).
				collect(Collectors.toList());

	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> input = new HashMap<>();
		input.put("Vijay", 3);
		input.put("Nagaraj", 20);
		input.put("Karigowdara", 7);
		sortMap(input);
		
	}

}
