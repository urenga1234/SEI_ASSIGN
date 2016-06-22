package com.cts.upen.demo;

public class DeduplicatorDemo {

	public static void main(String[] args)
	{
		
		int[] inputArray={1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
	            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
	            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
		
		DeDuplicatorUtil demoDeDuplicatorUtil= new DeDuplicatorUtil();
		
		
		int[] outputArray=demoDeDuplicatorUtil.deDuplicate(inputArray);
		System.out.println("Default Deduplicator implementation result");
		for (int i : outputArray) {
			System.out.println(i);
		}
		
		int[] outputArray1=demoDeDuplicatorUtil.stableDeDuplicator(inputArray);
		System.out.println("Order Preserving Deduplicator implementation result");
		for (int i : outputArray1) {
			System.out.println(i);
		}
		
		
		int[] outputArray2=demoDeDuplicatorUtil.deDuplicator(inputArray, new IntegerDeDuplicator());
		System.out.println("Custom  Deduplicator implementation result");
		for (int i : outputArray2) {
			System.out.println(i);
		}
	}
}
