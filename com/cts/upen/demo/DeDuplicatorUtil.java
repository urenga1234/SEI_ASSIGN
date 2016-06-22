package com.cts.upen.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeDuplicatorUtil {
	
	
	
	/*
	 * this is a unstable version of array deduplication utilty
	 * there is no garentee the input order of elements in the inputarray 
	 * will be retained in the result and  there are no garentees for thread safety 
	 */
	public int[] deDuplicate(int[] input)
	{
		
		if( input==null || input.length<2)
			return input;
		
		Set<Integer> set = new HashSet<Integer>();

		for(int i = 0; i < input.length; i++){
		  set.add(input[i]);
		}
		int j=0;
		int[] result = new int[set.size()];
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			result[j++]=integer.intValue();			
		}
		return result;
	}
	/*
	 * this is a stable version of array deduplication utilty
	 * the input order of elements in the inputarray will be retained in the result
	 * there are no garentees for thread safety 
	 */
	public int[] stableDeDuplicator(int[] input)
	{
		
		
		if( input==null || input.length<2)
			return input;
		
		
		Set<Integer> set = new LinkedHashSet<Integer>();

		for(int i = 0; i < input.length; i++){
		  set.add(input[i]);
		}
		int j=0;
		int[] result = new int[set.size()];
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			result[j++]=integer.intValue();			
		}
		return result;
	}
	/*
	 * this is a custom version of array deduplication utilty
	 * this allows the user to provide the remove duplicates algorithm
	 * the user can Extend IDeDuplicator to provide his implementation
	 * there are no garentees for thread safety 
	 */
	public int[] deDuplicator(int[] input,IDeDuplicator duplicator)
	{
		
		if( input==null || input.length<2)
			return input;
		
		Integer[] newArray = new Integer[input.length];
		int i = 0;
		for (int value : input) {
		    newArray[i++] = Integer.valueOf(value);
		}
	    
		Integer[] deDupArray= (Integer[]) duplicator.removeDuplicates(newArray);
		
		
		int[] result = new int[deDupArray.length];
		for (int j = 0; j < deDupArray.length; j++) {
			result[j] = deDupArray[j].intValue();
		}
		return result;
	}
	
	
	
	

}
