package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepetetiveWords {

	public static void main(String[] args) {
		String s = "Manual Testing API testing Automation testing Rest API";
		String[] allwords = s.split(" ");
		Map<String, Integer> m = new LinkedHashMap<>();

		for (String word : allwords) {

			if (m.containsKey(word)) {
				
				//System.out.println(m);
				
				Integer integer = m.get(word);
				m.put(word, ++integer);

			} else {
				m.put(word, 1);
			}

		}
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
				
			}
			
		}

	}
}
