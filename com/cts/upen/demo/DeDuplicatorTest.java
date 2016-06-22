package com.cts.upen.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeDuplicatorTest {

	
	int[] randomarray={1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	
	DeDuplicatorUtil testDeDuplicatorUtil=null;
	@Before
	public void setUp() throws Exception {
		
		testDeDuplicatorUtil=new DeDuplicatorUtil();

	}

	@After
	public void tearDown() throws Exception {
		testDeDuplicatorUtil=null;
	}

	@Test
	public void testdeDuplicate() {
		int[] output=testDeDuplicatorUtil.deDuplicate(randomarray);
		assertNotNull(output);
		assertTrue(output.length <= randomarray.length);
	
	}
	
	@Test
	public void testStableDeDuplicator(){
		int[] output=testDeDuplicatorUtil.stableDeDuplicator(randomarray);
		assertNotNull(output);
		assertTrue(output.length <= randomarray.length);
		assertTrue(checkOrder(randomarray,output));
	}
	
	@Test
	public void testCustomDeDuplicator(){
		int[] output=testDeDuplicatorUtil.deDuplicator(randomarray, new IntegerDeDuplicator());
		assertNotNull(output);
		assertTrue(output.length <= randomarray.length);
	}
	//since we are removing the duplicates index of a element in output array can be less the 
	//input array or equal when the order of input elements is preserverd
	boolean  checkOrder(int[] input,int[] output)
	{
		 
		boolean match=false;
		List<Integer> inputLIst=new ArrayList<Integer>();
		
		for (int i = 0; i < input.length; i++) {
			inputLIst.add(input[i]);
		}
		List<Integer> outLIst=new ArrayList<Integer>();
		for (int i = 0; i < output.length; i++) {
			outLIst.add(output[i]);
		}
	    for (Iterator iterator = outLIst.iterator(); iterator.hasNext();) {
			int integer = (int) iterator.next();
			
			int start=inputLIst.indexOf(integer);
			int end =outLIst.indexOf(integer);
			
			if(start >= end)
					match=true;
			else
				match=false;
			
		}
	    return match;
	}

}
