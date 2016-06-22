package com.cts.upen.demo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IntegerDeDuplicator implements  IDeDuplicator {

	/*
	 * this is a stable version of array deduplication provided by the user extension
	 * the input order of elements in the inputarray will be retained in the result
	 * there are no garentees for thread safety 
	 */
	public Object[] removeDuplicates(Object[] input)
	{
		Integer[] intInput=(Integer[])input;		
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int i = 0; i < intInput.length; i++){
		  set.add(intInput[i]);
		}		
		int j=0;
		Integer[] result = new Integer[set.size()];
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			result[j++]=integer;			
		}
		return result;
	}
}
