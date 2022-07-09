package com.java;

import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class HowAreYouWorld {

	public static void main(String[] args) {		

		System.out.println("\n--- ArrayList ---");
		// ArrayList -> JavaScript array like
		ArrayList arrayhashSetTest = new ArrayList();
		arrayhashSetTest.add("Ala");
		arrayhashSetTest.add(1);
		arrayhashSetTest.add(1, 20.2d);
		arrayhashSetTest.set(2, ((float)(int)arrayhashSetTest.get(2) + 1.0d));
		
		for(int i = 0; i < arrayhashSetTest.size(); i++) {
			System.out.println(arrayhashSetTest.get(i));
		}
		
		System.out.println("\n--- HashSet ---");
		// HashSet -> block repeated values and do not have order
		Set<String> hashSetTest = new HashSet<String>();
		hashSetTest.add("vitor");
		hashSetTest.add("vitor");
		hashSetTest.add("Vitor");
		hashSetTest.add("test");
		
		// print 1
		String[] printSet = hashSetTest.toArray(new String[hashSetTest.size()]);
		for(byte i = 0; i < printSet.length; i++) {
			System.out.println(printSet[i]);
		}
		// print 2
		for(String value : hashSetTest) {
			System.out.println(value);
		}
		
		System.out.println("\n--- LinkedHashSet ---");
		// LinkedHashSet -> preserves order in change of resources cost
		Set<String> linkedHashSetTest = new LinkedHashSet<String>();
		linkedHashSetTest.add("vitor");
		linkedHashSetTest.add("vitor");
		linkedHashSetTest.add("Vitor");
		linkedHashSetTest.add("test");
		
		for(String value : linkedHashSetTest) {
			System.out.println(value);
		}
		
		System.out.println("\n--- HashMap ---");
		// HashMap -> like JSON's, store keys and values
		Map<Integer, String> hashMapTest = new HashMap<Integer, String>();
		hashMapTest.put(1, "A");
		hashMapTest.put(2, "B");
		hashMapTest.put(3, "C");
		
	    // iterating through key/value mappings
	    System.out.print("Entries: ");
	    for(Entry<Integer, String> entry: hashMapTest.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }

	    // iterating through keys
	    System.out.print("\nKeys: ");
	    for(Integer key: hashMapTest.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }

	    // iterating through values
	    System.out.print("\nValues: ");
	    for(String value: hashMapTest.values()) {
	      System.out.print(value);
	      System.out.print(", ");
	    }
	    
	}

}
